package com.algods.graph.mst;

import com.algods.graph.mst.EdgeWeightedGraph;
import com.algods.graph.mst.Edge;
import com.algods.sort.priorityqueue.IndexMinPQ;
import com.algods.graph.beans.Bag;

import java.util.Arrays;
import java.util.stream.Collectors;

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

       System.out.println("BEF BEF VISIT " + g.V());
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

    public Iterable<Edge> edges()
    {

        Bag<Edge> edges = new Bag<>();

        for(int i = 1; i < edgeTo.length; i++)
        {
           edges.add(edgeTo[i]);
        }
 

        return edges;

    }

    public double weight()
    {
        return Arrays.asList(edgeTo)
                     .stream()
                     .filter(e -> e != null)
                     .map(e -> e.weight())
                     .reduce(0.0, Double::sum);
    }
}
