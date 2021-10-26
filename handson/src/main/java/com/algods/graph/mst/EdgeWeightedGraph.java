package com.algods.graph.mst;

import com.algods.graph.beans.Bag;

/**
  * <h1>EdgeWeightedGraph</h1>
  * This class is an implementation for EdgeWeightedGraph
  * <p> Implementation for EdgeWeightedGraph Data Structure in Java to be used in
  * Minimum Spanning Tree.
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-24
  */


public class EdgeWeightedGraph
{

     private final int V;
     private int E; 
     private Bag<Edge>[] adj;

     public EdgeWeightedGraph(int V)
     {
        this.V = V;

        adj = (Bag<Edge>[])new Bag[V];
        

        for(int i = 0; i < adj.length; i++)
        {
           adj[i] = new Bag<>();
        }
     }

     public void addEdge(Edge e)
     {
        int v = e.either();
        int w = e.other(v);

        adj[v].add(e);
        adj[w].add(e);

        E++;
     }

     public int V()
     {
        return V;
     }

     public int E()
     {
        return E;
     }

     public Iterable<Edge> adj(int v)
     {

        if(v < 0 || v >= adj.length)
        {
            throw new RuntimeException("Invalid inout index");
        }

        return adj[v];
     }

     public Iterable<Edge> edges()
     {

        Bag<Edge> edges = new Bag<>();

        for(int k = 0 ; k < V; k++)
        {
           for(Edge e:adj(k))
           {
              if(e.other(k) > k)
              {
                 edges.add(e);
              }
           }
        }

        return edges;
     }
}
