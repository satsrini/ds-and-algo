package com.algods.graph.mst;

import com.algods.graph.mst.EdgeWeightedGraph;
import com.algods.graph.mst.Edge;
import com.algods.sort.priorityqueue.IndexMinPQ;

/**
  * <h1>PrimMST</h1>
  * This class is an implementation for PrimMST algorithm.
  * <p> Implementation for Prim's Minimum Spanning Tree for an Edge Weighted Undirected
  * Graph. This approach uses Index Minimum Priority Queue of Edges with an 'eager' 
  * approach.This Index Minimum Priority Queue is built using Binary Heap data structure.
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-11-04
  */


public class PrimMST
{

    private Edge[] edgeTo;
    private double[] distTo;
    private boolean[] marked;
    private IndexMinPQ pq;
    

    public PrimMST(EdgeWeightedGraph g)
    {
       edgeTo = new Edge[g.V()];
       distTo = new double[g.V()];
       marked = new boolean[g.V()];
       pq = new IndexMinPQ(g.V());

       for(int i = 0; i < distTo.length; i++)
       {
          distTo[i] = Double.POSITIVE_INFINITY;
       }

       distTo[0] = 0.0;
       pq.insert(0, 0.0);

       while(!pq.isEmpty())
       {
          visit(g,pq.delMin());
       }
       

    }

    private void visit(EdgeWeightedGraph g, int v)
    {
       marked[v] = true;

       for(Edge e:g.adj(v))
       {
          int w = e.other(v);

          if(marked[w])
          {
             continue;
          }

          if(e.weight() < distTo[w])
          {
             distTo[w] = e.weight();
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
}
