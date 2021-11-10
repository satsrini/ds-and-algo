package com.algods.graph.shortestpath.acyclic;

import com.algods.graph.shortestpath.EdgeWeightedDiGraph;
import com.algods.graph.shortestpath.DirectedEdge;

import java.util.Deque;
import java.util.ArrayDeque;



/**
  * <h1>DirectedCycleEdgeWeighted</h1>
  * This class is an implementation for DirectedCycleEdgeWeighted Algorithm
  * <p> Implementation for DirectedCycleEdgeWeighted Algorithm in Java to be used to
  * find the presence of atleast one cycle in an Edge Weighted Directed Graph.
  * Or to put it simply, it checks whether the given Edge Weighted Directed Graph 
  * is acyclic or not. If cyclic, it also returns the path of the cycle found.
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-11-10
  */


public class DirectedCycleEdgeWeighted
{

   private boolean[] stacked;
   private boolean[] marked;
   private DirectedEdge[] edgeTo;

   private Deque<DirectedEdge> cycle;
   

   public DirectedCycleEdgeWeighted(EdgeWeightedDiGraph g)
   {
      stacked = new boolean[g.V()];
      marked = new boolean[g.V()];
      edgeTo = new DirectedEdge[g.V()];

      for(int i = 0; i < g.V(); i++)
      {

         if(hasCycle())
         {
           break;
         }

         if(!marked[i])
         {
            dfs(g,i);
         }
      }

   }

   private void dfs(EdgeWeightedDiGraph g, int v)
   {

      marked[v] = true;
      stacked[v] = true;

      for(DirectedEdge e:g.adj(v))
      {

         if(hasCycle())
         {
            return;
         }

         int w = e.to();

         edgeTo[w] = e;

         if(!marked[w])
         {
             dfs(g,w);
         }else
         {
            if(stacked[w])
            {
               cycle = new ArrayDeque<>();

               DirectedEdge startEdge = edgeTo[w];
         
               cycle.addFirst(startEdge);

               DirectedEdge prevEdge = edgeTo[startEdge.from()]; // going backwards

               while(!prevEdge.equals(startEdge))
               {
                  cycle.addFirst(prevEdge);
                  prevEdge = edgeTo[prevEdge.from()];
               }

               cycle.addFirst(startEdge); // adding again just to represent it as completed cycle.

            }
         }
 
      }

      stacked[v] = false;
      


   }

   public boolean hasCycle()
   {
      return (cycle != null);
   }

   public Iterable<DirectedEdge> cycle()
   {
      return cycle;
   }
}
