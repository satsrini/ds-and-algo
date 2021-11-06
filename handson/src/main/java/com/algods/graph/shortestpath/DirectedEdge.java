package com.algods.graph.shortestpath;


/**
  * <h1>DirectedEdge</h1>
  * This class is an implementation for Directed Edge Data Structure
  * <p> Implementation for Directed Edge Data Structure in Java to be used in
  * finding shortest paths in an Edge Weighted Directed Graph.
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-11-06
  */


public class DirectedEdge
{
    private final int v;
    private final int w;
    private double weight;

    public DirectedEdge(int v, int w, double weight)
    {
       this.v = v;
       this.w = w;
       this.weight = weight;
    }

    public int from()
    {
       return v;
    }

    public int to()
    {
       return w;
    }

    public double weight()
    {
       return weight;
    }

    @Override
    public String toString()
    {
       return String.format("%d -> %d  %.2f", v,w,weight);
    }

}
