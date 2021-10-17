package com.algods.graph.directed.dfs.dag;

import com.algods.graph.directed.DiGraph;
import java.util.Deque;
import java.util.ArrayDeque;

/**
  * <h1>DirectedCycle</h1>
  * This class is an implementation for DirectedCycle algorithm
  * <p> Implementation for finding if a given DiGraph is a Directed Acyclic Graph(DAG)
  * or not. The algorithm checks if there is atleast one cycle present in the DiGraph.
  * Also the algorithm finds the path of the cycle present.
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-16
  */


public class DirectedCycle
{

    private Deque<Integer> cycle;
    private boolean[] marked;
    private boolean[] stacked;
    private int[] edgeTo;

    public DirectedCycle(DiGraph g)
    {
        marked = new boolean[g.V()];
        stacked = new boolean[g.V()];
        edgeTo = new int[g.V()];
        
        for(int i = 0;i < g.V(); i++)
        {
           if(!marked[i])
           {
              dfs(g,i);
           }
        }

    }

    private void dfs(DiGraph g, int v)
    {
        marked[v] = true;
        stacked[v] = true;

        for(int k:g.adj(v))
        {
            if(hasCycle())
            {
               return;
            }else
            if(!marked[k])
            {
               edgeTo[k] = v;
               dfs(g,k);
            }else
            if(stacked[k])
            {
               cycle = new ArrayDeque<>();

               for(int x = v; x != k; x = edgeTo[x])
               {
                  cycle.addFirst(x);
               }
               cycle.addFirst(k);
               cycle.addFirst(v);
            }

        }
        

        stacked[v] = false;

    }

    public boolean hasCycle()
    {
       return (cycle != null);
    }

    public Iterable<Integer> cycle()
    {
       return cycle;

    }

}
