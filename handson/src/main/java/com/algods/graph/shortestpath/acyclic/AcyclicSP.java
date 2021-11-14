package com.algods.graph.shortestpath.acyclic;

import com.algods.graph.shortestpath.EdgeWeightedDiGraph;
import com.algods.graph.shortestpath.DirectedEdge;

import java.util.Deque;
import java.util.ArrayDeque;

/**
  * <h1>AcyclicSP</h1>
  * This class is an implementation for AcyclicSP algorithm.
  * <p> Implementation for AcyclicSP algorithm in Java to be used to find
  * Shortest Path in an Edge Weighted DAG.
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-11-13
  */


public class AcyclicSP
{

   private double[] distTo;
   private DirectedEdge[] edgeTo;

   public AcyclicSP(EdgeWeightedDiGraph g, int s)
   {
      distTo = new double[g.V()];
      edgeTo = new DirectedEdge[g.V()];

      for(int i = 0; i < distTo.length; i++)
      {
         distTo[i] = Double.POSITIVE_INFINITY;
      }

      distTo[s] = Double.NEGATIVE_INFINITY;

      TopologicalEdgeWeighted topologicalEdgeWeighted 
                                 = new TopologicalEdgeWeighted(g);

      if(!topologicalEdgeWeighted.isDAG())
      {
          throw new IllegalArgumentException("The given EdgeWeightedDiGraph is not acyclic");
      }

      for(int k:topologicalEdgeWeighted.order())
      {
          relax(g,k);
      }

   }

   private void relax(EdgeWeightedDiGraph g, int v)
   {

      for(DirectedEdge e:g.adj(v))
      {
         int w = e.to();

         if(distTo[w] == Double.NEGATIVE_INFINITY)
         {
            continue;
         }

         if(distTo[v] == Double.POSITIVE_INFINITY || distTo[v] == Double.NEGATIVE_INFINITY)
         {
            distTo[w] = e.weight();
            edgeTo[w] = e;
         }else
         if(distTo[w] > distTo[v] + e.weight())
         {
            distTo[w] = distTo[v] + e.weight();
            edgeTo[w] = e;
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

      Deque<DirectedEdge> stack = new ArrayDeque<>();

      DirectedEdge edge = edgeTo[v];

      while(edge != null)
      {
         stack.addFirst(edge);
         edge = edgeTo[edge.from()];
      }

      return stack;
   } 

}
