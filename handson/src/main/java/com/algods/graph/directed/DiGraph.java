package com.algods.graph.directed;

import com.algods.graph.beans.Bag;

/**
  * <h1>DiGraph</h1>
  * This class is an implementation for DiGraph Data Structure
  * <p> Implementation for DiGraph Data Structure in Java
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-12
  */


public class DiGraph
{

    private int V;
    private int E;
    private Bag<Integer>[] adj;

    public DiGraph(int V)
    {
       this.V = V;
       this.E = 0;
       adj = (Bag<Integer>[])new Bag[this.V];

       for(int i = 0; i < V; i++)
       {
          adj[i] = new Bag<Integer>();
       }
    }

    public int V()
    {
       return V;
    }

    public int E()
    {
       return E;
    }

    public void addEdge(int v, int w)
    {

       if(v >= V || w >= V)
       {
           String msg = String.format("Input vertex cannot be greater than the max vertex index %d", (V-1));
           throw new RuntimeException(msg);
       }

       adj[v].add(w);
       this.E++;
    }

    public Iterable<Integer> adj(int v)
    {
        return adj[v];
    }

    public DiGraph reverse()
    {
        DiGraph diGraph = new DiGraph(this.V);
        
        for(int i = 0; i < V; i++)
        {
           for(int k:this.adj(i))
           {
               diGraph.addEdge(k,i);
           }            
        }

        return diGraph;
    }

    @Override
    public String toString()
    {
       StringBuffer result = new StringBuffer();

       for(int i = 0; i < V; i++)
       {
         result.append(i + ": ");
         for(int k:this.adj(i))
         {
            result.append(k + " ");
         }
         result.append("\n");
       }

       return result.toString();
    }

}
