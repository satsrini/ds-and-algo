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


     public KruskalMST(EdgeWeightedGraph g)
     {
        mst = new LinkedList<>();
        uf = new UF(g.V());

        Iterable<Edge> edgeIter = g.edges();

        List<Edge> edgeList = new ArrayList<>();

        Edge[] edgeArr = new Edge[g.E()];

        int index = 0;

        for(Edge e:edgeIter)
        {
           edgeArr[index++] = e;
        }

        pq = new MinPQ<>(edgeArr);      

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

        }
        
     }

     public Iterable<Edge> edges()
     {
        return mst;
     }

     public double weight()
     {
        double weight = 0.0;

        for(Edge e:mst)
        {
          weight += e.weight();
        }

        return weight;
     }
}
