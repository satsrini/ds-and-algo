package com.algods.graph.directed.dfs.path;

import com.algods.graph.directed.DiGraph;
import com.algods.graph.beans.Bag;
import java.util.Queue;
import java.util.LinkedList;

/**
  * <h1>BreadthFirstDirectedPaths</h1>
  * This class is an implementation for BreadthFirstDirectedPaths algorithm
  * <p> Implementation for finding path between vertices in a directed
  * graph using Breadth First Path algorithm in Java
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-15
  */


public class BreadthFirstDirectedPaths
{

    private boolean[] marked;
    private int s;
    private int[] edgeTo;


    public BreadthFirstDirectedPaths(DiGraph g, int s)
    {
        this.s = s;
        marked = new boolean[g.V()];
        edgeTo = new int[g.V()];
    
        bfs(g,s);
    }

    private void bfs(DiGraph g, int v)
    {

       marked[v] = true;
       Queue<Integer> queue = new LinkedList<>();
       queue.add(v);

       while(!queue.isEmpty())
       {
          int k = queue.remove();

          for(int w:g.adj(k))
          {
             if(!marked[w])
             {
                marked[w] = true;
                edgeTo[w] = k;
                queue.add(w);
             }
          }          

       }

    }

    public boolean hasPathTo(int v)
    {
        if(v < 0 || v >= marked.length)
        {
           throw new RuntimeException("Input index is outside the bounds of DiGraph vertices");

        }
         
         return marked[v];
    }

    public Iterable<Integer> pathTo(int v)
    {
  
         if(!hasPathTo(v))
         {
             return null;
         }

         Bag<Integer> bag = new Bag<>();

         for(int x = v; x != s; x = edgeTo[x])
         {
             bag.add(x);
         }

         bag.add(s);        

         return bag;
    }

}
