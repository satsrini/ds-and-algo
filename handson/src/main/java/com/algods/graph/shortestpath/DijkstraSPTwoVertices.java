package com.algods.graph.shortestpath;

import com.algods.sort.priorityqueue.IndexMinPQ;

import com.algods.graph.beans.Bag;

/**
  * <h1>DijkstraSPTwoVertices</h1>
  * This class is an implementation for DijkstraSPTwoVertices Algorithm.
  * <p> Implementation for DijkstraSPTwoVertices Algorithm in Java to be used
  * in finding shortest paths between any two vertices only in an EdgeWeightedDirected 
  * Graph
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-11-08
  */


public class DijkstraSPTwoVertices
{

   private DirectedEdge[] edgeTo; // last edge in the path from source to current index
   private double[] distTo; // total weight between current index and source
   private IndexMinPQ<Double> pq;

   private int t;

   public DijkstraSPTwoVertices(EdgeWeightedDiGraph g, int s, int t)
   {
      this.t = t;
      edgeTo = new DirectedEdge[g.V()];
      distTo = new double[g.V()];
      pq = new IndexMinPQ<>(g.V());

      for(int i = 0; i < distTo.length; i++)
      {
         distTo[i] = Double.POSITIVE_INFINITY;
      }

      distTo[s] = 0.0;
      pq.insert(s,0.0); // here source and dest are both s, hence weight = 0.0

      while(!pq.isEmpty())
      {
        int q = pq.delMin();
        relax(g,q);
        
        if(q == t)
        {
           break;
        }
      }

   }

   private void relax(EdgeWeightedDiGraph g, int v)
   {

      for(DirectedEdge e:g.adj(v))
      {
         int w = e.to();

         if(distTo[w] > distTo[v] + e.weight())
         {
            distTo[w] = distTo[v] + e.weight();
            edgeTo[w] = e;
           
            if(pq.contains(w))
            {
               pq.changeKey(w,distTo[w]);
            }else
            {
               pq.insert(w,distTo[w]);
            }

         }
      }

   }

   public double distTo()
   {
      return distTo[t];
   }

   public boolean hasPathTo()
   {
      return distTo[t] < Double.POSITIVE_INFINITY;
   }

   public Iterable<DirectedEdge> pathTo()
   {
      if(!hasPathTo())
      {
         return null;
      }

      Bag<DirectedEdge> bag = new Bag<>();


      int x = t;
      while(edgeTo[x] != null)
      {
         bag.add(edgeTo[x]);
         x = edgeTo[x].from();
      }


      return bag;
   }

}
