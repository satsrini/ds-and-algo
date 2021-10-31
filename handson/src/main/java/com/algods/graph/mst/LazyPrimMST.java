package com.algods.graph.mst;


import java.util.Queue;
import java.util.LinkedList;

import com.algods.sort.priorityqueue.MinPQ;

/**
  * <h1>LazyPrimMST</h1>
  * This class is an implementation for LazyPrimMST algorithm.
  * <p> Implementation for Prim's Minimum Spanning Tree for an Edge Weighted Undirected 
  * Graph. This approach uses Minimum Priority Queue of Edges with a 'lazy' approach.
  * This Minimum Priority Queue is built using Binary Heap data structure.
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-31
  */


public class LazyPrimMST
{

    private boolean[] marked;
    private MinPQ<Edge> pq;
    private Queue<Edge> mst;
    

    /*
     * EdgeWeighted, g, is expected to be Connected. 
     */
    public LazyPrimMST(EdgeWeightedGraph g)
    {
        marked = new boolean[g.V()];
        pq = new MinPQ<>(g.E());
        mst = new LinkedList<>();

        visit(g,0); // we are starting to visit from vertex 0

        while(!pq.isEmpty())
        {
           Edge e = pq.deleteMin();

           int m = e.either();
           int n = e.other(m);

           if(marked[m] && marked[n])
           {
              continue;  // This edge is already added to mst
           }

           mst.add(e);

           if(!marked[m])
           {
              visit(g,m);
           }

           if(!marked[n])
           {
              visit(g,n);
           }

        }
        
    }

    private void visit(EdgeWeightedGraph g, int v)
    {
        marked[v] = true;

        for(Edge e:g.adj(v))
        {
           if(!marked[e.other(v)])
           {
              pq.insert(e);
           }
        }
    }

    public Iterable<Edge> edges()
    {
       return mst;
    }

    public double weight()
    {
       return mst
               .stream()
               .map(e -> e.weight())
               .reduce(0.0, Double::sum);
    }

}
