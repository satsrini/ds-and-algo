package com.algods.graph.mst;

/**
  * <h1>Edge</h1>
  * This class is an implementation for Edge Data Structure
  * <p> Implementation for Edge Data Structure in Java to be used in 
  * Minimum Spanning Tree.
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

    public double weight()
    {
       return weight;
    }   

    public int either()
    {
       return v;
    }

    public int other(int s)
    {

       if(s == w)
       {
          return v;
       }else
       if(s == v)
       {
          return w;
       }else
       {
          throw new RuntimeException("Invalid input vertex");
       }
      
    }

    @Override
    public int compareTo(Edge that)
    {
       if(this.weight() > that.weight())
       {
          return 1;
       }else
       if(this.weight() < that.weight())
       {
          return -1;
       }else
       {
          return 0;
       }
    }

    @Override
    public String toString()
    {
       return String.format("vertex 1: %d , vertex 2: %d, weight: %.2f",
                            v,w,weight);
    }

}
