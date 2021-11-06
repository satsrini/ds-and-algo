package com.algods.graph.shortestpath;

import com.algods.graph.beans.Bag;

/**
  * <h1>EdgeWeightedDiGraph</h1>
  * This class is an implementation for Edge Weighted Directed Graph Data Structure
  * <p> Implementation for Edge Weighted Directed Graph Data Structure in Java to be used
  * in finding shortest paths.
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-11-06
  */


public class EdgeWeightedDiGraph
{
   private int V;
   private int E;

   private Bag<DirectedEdge>[] adj;

   public EdgeWeightedDiGraph(int V)
   {
      this.V = V;
      adj = (Bag<DirectedEdge>[])new Bag[V];

      for(int i = 0; i < adj.length; i++)
      {
         adj[i] = new Bag<>();
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

   public void addEdge(DirectedEdge e)
   {
      adj[e.from()].add(e);
      E++;
   }

   public Iterable<DirectedEdge> adj(int v)
   {
      return adj[v];
   }

   public Iterable<DirectedEdge> edges()
   {
       Bag<DirectedEdge> edges = new Bag<>();

       for(Bag<DirectedEdge> bag:adj)
       {
          for(DirectedEdge edge:bag)
          {
              edges.add(edge);
          }
       }

       return edges;

   }

   @Override
   public String toString()
   {
       StringBuffer str = new StringBuffer();

       for(DirectedEdge e:edges())
       {
          str.append(e.toString() + "\n");
       }

       return str.toString();

   }

}
