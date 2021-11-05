package com.algods.graph.mst;

import com.algods.graph.mst.EdgeWeightedGraph;
import com.algods.graph.mst.UF;
import com.algods.graph.mst.Edge;
import com.algods.sort.priorityqueue.MinPQ;

import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

/**
  * <h1>KruskalMST</h1>
  * This class is an implementation for KruskalMST algorithm.
  * <p> Implementation for Kruskal's Minimum Spanning Tree for an Edge Weighted Undirected
  * Graph. This approach uses Union Find Datastructure.
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-11-05
  */


public class KruskalMST
{

     private Queue<Edge> mst;
     private MinPQ<Edge> pq;
     private UF uf;

     private double weight;

     public KruskalMST(EdgeWeightedGraph g)
     {
        mst = new LinkedList<>();
        uf = new UF(g.V());

        pq = new MinPQ<>(g.E());

        for(Edge e:g.edges())
        {
           pq.insert(e);
        }

        weight = 0.0;

        while(!pq.isEmpty() && mst.size() < g.V()-1)
        {

           Edge e = pq.deleteMin();
           int v = e.either();
           int w = e.other(v);

           if(uf.connected(v,w))
           {
              continue;
           }
           
           uf.union(v,w);

           mst.add(e);
           weight += e.weight();
        }
        
     }

     public Iterable<Edge> edges()
     {
        return mst;
     }

     public double weight()
     {
        return weight;
     }
}
