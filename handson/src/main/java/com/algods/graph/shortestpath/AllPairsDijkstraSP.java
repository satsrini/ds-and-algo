package com.algods.graph.shortestpath;


/**
  * <h1>AllPairsDijkstraSP</h1>
  * This class is an implementation for AllPairsDijkstraSP Algorithm
  * <p> Implementation for AllPairsDijkstraSP Algorithm in Java to be used
  * in finding shortest paths between any two pair of vertices in an 
  * EdgeWeightedDiGraph.
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-11-07
  */


public class AllPairsDijkstraSP
{

    private DijkstraSP[] dijkstraSPs;

    public AllPairsDijkstraSP(EdgeWeightedDiGraph g)
    {
       dijkstraSPs = new DijkstraSP[g.V()];

       for(int i = 0; i < g.V(); i++)
       {
           dijkstraSPs[i] = new DijkstraSP(g,i);
       }

    }

    public Iterable<DirectedEdge> path(int v, int w)
    {
       return dijkstraSPs[v].pathTo(w);
    }

    public double dist(int v, int w)
    {
       return dijkstraSPs[v].distTo(w);
    }

}
