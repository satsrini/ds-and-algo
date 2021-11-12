package com.algods.graph.shortestpath.acyclic;

import com.algods.graph.shortestpath.EdgeWeightedDiGraph;
import com.algods.graph.shortestpath.DirectedEdge;

import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayDeque;

/**
  * <h1>DepthFirstOrderEdgeWeighted</h1>
  * This class is an implementation for DepthFirstOrderEdgeWeighted Algorithm.
  * <p> Implementation of DepthFirstOrderEdgeWeighted in Java to be used to find 
  *     preorder, postorder and reverse post order of Directed Edges in an Edge Weighted
  *     Directed Graph. The reverse post order would give the Topological order of the 
  *     Directed Edges in the given Edge Weighted Directed Graph.
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-11-11
  */


public class DepthFirstOrderEdgeWeighted
{

    private boolean[] marked;
    private Queue<Integer> preOrder;
    private Queue<Integer> postOrder;
    private Deque<Integer> reversePostOrder;
   
    public DepthFirstOrderEdgeWeighted(EdgeWeightedDiGraph g)
    {
       marked = new boolean[g.V()];
       preOrder = new LinkedList<>();
       postOrder = new LinkedList<>();
       reversePostOrder = new ArrayDeque<>();
    }

    private void dfs(EdgeWeightedDiGraph g, int v)
    {
       marked[v] = true;

       preOrder.add(v);
       for(DirectedEdge e:g.adj(v))
       {
          int w = e.to();

          if(!marked[w])
          {
             dfs(g,w);
          }

       }
       postOrder.add(v);
       reversePostOrder.addFirst(v); // addFirst() makes it a stack during Iteration.

    }

    public Iterable<Integer> pre()
    {
       return preOrder;
    }

    public Iterable<Integer> post()
    {
       return postOrder;
    }

    public Iterable<Integer> reversePost()
    {
       return reversePostOrder;
    }
}
