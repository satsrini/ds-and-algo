package com.algods.graph.directed.scc;

import com.algods.graph.directed.DiGraph;
import com.algods.graph.directed.order.DepthFirstOrder;

/**
  * <h1>KosarajuSCC</h1>
  * This class is an implementation for Kosaraju's Strongly Connected Components in a 
  * DiGraph
  * <p> Implementation for finding Strongly Connected components in a DiGraph.
  *     It uses Kosaraju's algorithm making use of DepthFirstOrder approach.
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-22
  */


public class KosarajuSCC
{

    private int count;
    private int[] id;
    private boolean[] marked;

    public KosarajuSCC(DiGraph g)
    {
        id = new int[g.V()];
        marked = new boolean[g.V()];

        DepthFirstOrder depthFirstOrder = new DepthFirstOrder(g.reverse());

        for(int s:depthFirstOrder.reversePost())
        {
           if(!marked[s])
           {
              dfs(g,s);
              count++;
           }
        }

    }

    private void dfs(DiGraph g, int v)
    {
        id[v] = count;
        marked[v] = true;

        for(int k:g.adj(v))
        {
           if(!marked[k])
           {
              dfs(g,k);
           }
        }
    }

    public boolean stronglyConnected(int v, int w)
    {
 
       if(v < 0 || w < 0 || v >= id.length || w >= id.length)
       {
          throw new RuntimeException("Invalid input");
       }

       return (id[v] == id[w]);
    }

    public int count()
    {
       return count;
    }

    public int id(int v)
    {
       if(v >= id.length || v < 0)
       {
           throw new RuntimeException("Invalid input");
       }
       return id[v];
    }

}
