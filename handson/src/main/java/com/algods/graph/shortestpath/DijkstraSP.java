package com.algods.graph.shortestpath;

import com.algods.sort.priorityqueue.IndexMinPQ;

/**
  * <h1>DijkstraSP</h1>
  * This class is an implementation for DijkstraSP Algorithm
  * <p> Implementation for DijkstraSP Algorithm in Java to be used
  * in finding shortest paths.
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-11-07
  */


public class DijkstraSP
{

   private DirectedEdge[] edgeTo; // last edge in the path from source to current index
   private double[] distTo; // total weight between current index and source
   private IndexMinPQ<Double> pq;

   public DijkstraSP(EdgeWeightedDiGraph g, int s)
   {
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
        relax(g,pq.delMin());
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

   public double distTo(int v)
   {
      return distTo[v];
   }

   public boolean hasPathTo(int v)
   {
      return distTo[v] < Double.POSITIVE_INFINITY;
   }

   public Iterable<DirectedEdge> pathTo(int v)
   {
      return null;
   }

}
