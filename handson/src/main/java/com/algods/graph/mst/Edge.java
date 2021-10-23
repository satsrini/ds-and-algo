package com.algods.graph.mst;

/**
  * <h1>Edge</h1>
  * This class is an implementation for Edge Data Structure
  * <p> Implementation for Edge Data Structure in Java
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-23
  */


public class Edge implements Comparable<Edge>
{
    private final int v;
    private final int w;
    private final double weight;

    public Edge(int v, int w, double weight)
    {
       this.v = v;
       this.w = w;
       this.weight = weight;
    }

    


}
