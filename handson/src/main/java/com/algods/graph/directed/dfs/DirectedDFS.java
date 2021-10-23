package com.algods.graph.directed.dfs;

import com.algods.graph.directed.DiGraph;

/**
  * <h1>DirectedDFS</h1>
  * This class is an implementation for DirectedDFS Algorithm
  * <p> Implementation for DirectedDFS Algorithm in Java
  *     For a given vertex, v, in a DiGraph, it tells us whether any vertex 
  *     w is connected to v or not. ie is there a directed edge from v to w  ?
  *     v --> w  --- true or false ?
  *     Please note that the presence of directed edge from v to w does not 
  *     implicitly mean the presence of directed edge from w to v.
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-14
  */


public class DirectedDFS
{

    private boolean marked[];

    public DirectedDFS(DiGraph g, int s)
    {
        marked = new boolean[g.V()];
        dfs(g,s);

    }

    public DirectedDFS(DiGraph g, Iterable<Integer> sources)
    {
       marked = new boolean[g.V()];     
   
       for(int k:sources)
       {
          if(!marked[k])
          {
              dfs(g,k);
          }
       }
    }

    private void dfs(DiGraph g, int v)
    {
       marked[v] = true;

       for(int w:g.adj(v))
       {
          if(!marked[w])
          {
              dfs(g,w);
          }

       }

    }

    public boolean marked(int v)
    {
       if(v < 0 || v >= marked.length)
       {
           throw new RuntimeException("Given index out of range for the DiGraph");
       }
       return marked[v];
    }


}
