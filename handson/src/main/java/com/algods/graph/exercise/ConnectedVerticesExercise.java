package com.algods.graph.exercise;

import com.algods.graph.undirected.Graph;

/**
  * <h1>ConnectedVerticesExercise</h1>
  * This class is an implementation for ConnectedVerticesExercise
  * <p> Problem statement: Given an undirected graph, write a method 
  *     that checks if any two vertices are connected or not.
  *     This should be implemented in the order of V+E
  *     V - total number of vertices in the given Graph
  *     E - total number of edges in the given Graph.
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-24
  */


public class ConnectedVerticesExercise
{

    private DFSGraphBean[] dfsGraphBeanArray;

    private boolean[] indexMarked;

    public ConnectedVerticesExercise(Graph g)
    {
        dfsGraphBeanArray = new DFSGraphBean[g.V()];
        indexMarked = new boolean[g.V()];

        for(int i = 0; i < dfsGraphBeanArray.length; i++)
        {
           dfsGraphBeanArray[i] = new DFSGraphBean(g);
        }

        for(int k = 0; k < g.V(); k++)
        {
           if(!indexMarked[k])
           {
               dfs(g,k);
           }
        }

    }

    private void dfs(Graph g, int s)
    {
        indexMarked[s] = true;

        for(int m:g.adj(s))
        {
           if(!indexMarked[m])
           {
              dfsGraphBeanArray[m].marked[s] = true;
              dfsGraphBeanArray[s].marked[m] = true;
              
              dfs(g,m);
           }          
        }
  
    }

    public boolean connected(int v, int w)
    {

       if(v < 0 || v >= dfsGraphBeanArray.length
                || w < 0 || w >= dfsGraphBeanArray.length)
       {
          throw new RuntimeException("Invalid input index");
       }

       return dfsGraphBeanArray[v].marked(w);

    }

    private class DFSGraphBean
    {

        private boolean[] marked; 

        private DFSGraphBean(Graph g)
        {
            marked = new boolean[g.V()];
        }

        private boolean marked(int w)
        {

           if(w < 0 || w >= marked.length)
           {
               throw new RuntimeException("Invalid input index.");
           }
           return marked[w];
        }

    }

}
