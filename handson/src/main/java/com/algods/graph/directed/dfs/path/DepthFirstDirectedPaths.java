package com.algods.graph.directed.dfs.path;


import com.algods.graph.directed.DiGraph;
import java.util.Stack;

/**
  * <h1>DepthFirstDirectedPaths</h1>
  * This class is an implementation for DepthFirstDirectedPaths algorithm
  * <p> Implementation for finding path between vertices in a directed
  * graph using Depth First Path algorithm in Java
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-14
  */


public class DepthFirstDirectedPaths
{
     private boolean[] marked;
     private int[] edgeTo;
     private int s;

     public DepthFirstDirectedPaths(DiGraph g, int s)
     {
         this.s = s;
         marked = new boolean[g.V()];
         edgeTo = new int[g.V()];

         dfs(g,s);
     }

     private void dfs(DiGraph g, int v)
     {
        marked[v] = true;

        for(int w:g.adj(v))
        {
           if(!marked[w])
           {
              edgeTo[w] = v;
              dfs(g,w);
           }
        }
     }


     public boolean hasPathTo(int v)
     {
        if(v < 0 || v >= marked.length)
        {
           throw new RuntimeException("Input index is outside the DiGraph bounds");
        }

        return marked[v];
     }

     public Iterable<Integer> pathTo(int v)
     {

        if(!hasPathTo(v))
        {
           return null;
        }

        Stack<Integer> stack = new Stack<>();

        for(int k = v; k != s; k = edgeTo[k])
        {
           stack.push(k);
        }        

        stack.push(s);

        return stack;

     }

}
