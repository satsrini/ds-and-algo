package com.algods.graph.directed.scc;

import com.algods.graph.directed.DiGraph;
import com.algods.graph.directed.dfs.DirectedDFS;

/**
  * <h1>TransitiveClosure</h1>
  * This class is an implementation for TransitiveClosure algorithm
  * <p> Implementation for TransitiveClosure algorithm in Java
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-23
  */



public class TransitiveClosure
{

    private DirectedDFS[] directedDFSArray;

    public TransitiveClosure(DiGraph g)
    {
       directedDFSArray = new DirectedDFS[g.V()];
       
       for(int i = 0; i < directedDFSArray.length; i++)
       {
           directedDFSArray[i] = new DirectedDFS(g,i);
       }

    }

    public boolean reachable(int v, int w)
    {

       if(v < 0 || v >= directedDFSArray.length || w < 0 || w >= directedDFSArray.length)
       {
           throw new RuntimeException("Invalid Input index.");
       }

       return directedDFSArray[v].marked(w);
    }
}
