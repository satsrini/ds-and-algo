package com.algods.graph.shortestpath.acyclic;

import com.algods.graph.shortestpath.EdgeWeightedDiGraph;

/**
  * <h1>TopologicalEdgeWeighted</h1>
  * This class is an implementation for TopologicalEdgeWeighted Algorithm.
  * <p> Implementation of TopologicalEdgeWeighted Algorithm in Java to be used to find
  *   Topologocal order in an Edge Weighted Directed Acyclic Graph(DAG).
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-11-13
  */


public class TopologicalEdgeWeighted
{

   private Iterable<Integer> order;
   private boolean cycle;

   public TopologicalEdgeWeighted(EdgeWeightedDiGraph g)
   {
       DirectedCycleEdgeWeighted directedCycleEdgeWeighted
               = new DirectedCycleEdgeWeighted(g);

       cycle = directedCycleEdgeWeighted.hasCycle();

       if(!cycle)
       {
           DepthFirstOrderEdgeWeighted depthFirstOrderEdgeWeighted
                         = new DepthFirstOrderEdgeWeighted(g);

           order = depthFirstOrderEdgeWeighted.reversePost();
       }

   }

   public Iterable<Integer> order()
   {
      return order;
   }

   public boolean isDAG()
   {
      return !cycle;
   }

}
