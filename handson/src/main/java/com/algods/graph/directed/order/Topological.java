package com.algods.graph.directed.order;

import com.algods.graph.directed.DiGraph;
import com.algods.graph.directed.dfs.dag.DirectedCycle;

/**
  * <h1>Topological</h1>
  * This class is an implementation for Topologocal sort algorithm
  * <p> Implementation for finding Topological orders in a DAG(Directed Acyclic Graph).
  * This class gives the Topological sort order for a given DiGraph
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-19
  */


public class Topological
{

    private Iterable<Integer> order;
    private boolean cycle;

    public Topological(DiGraph g)
    {
       DirectedCycle directedCycle = new DirectedCycle(g);
  
       cycle = directedCycle.hasCycle();

       if(!cycle)
       {
           DepthFirstOrder depthFirstOrder = new DepthFirstOrder(g);
           order = depthFirstOrder.reversePost();
         
       }

    }

    public Iterable<Integer> order()
    {
       return order;
    }

    public boolean isDAG()
    {
       return cycle;
    }

}
