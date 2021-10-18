package com.algods.graph.directed.order;

import com.algods.graph.directed.DiGraph;
import java.util.Queue;
import java.util.LinkedList;
import com.algods.graph.beans.Bag;


/**
  * <h1>DepthFirstOrder</h1>
  * This class is an implementation for DepthFirstOrder algorithm
  * <p> Implementation for finding Topological orders in a DAG(Directed Acyclic Graph)
  * Topological orders include pre order, post order and reverse post order.
  * 
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-18
  */


public class DepthFirstOrder
{

    private boolean[] marked;

    private Queue<Integer> pre;
    private Queue<Integer> post;
    private Bag<Integer> reversePost;

    public DepthFirstOrder(DiGraph g)
    {
       marked = new boolean[g.V()];
       pre = new LinkedList<>();
       post = new LinkedList<>();
       reversePost = new Bag<>();

       for(int i =0; i < g.V(); i++)
       {
           if(!marked[i])
           {
              dfs(g,i);
           }
       }

    }

    private void dfs(DiGraph g, int v)
    {

       marked[v] = true;

       pre.add(v);

       for(int k:g.adj(v))
       {
          if(!marked[k])
          {
             dfs(g,k);
          }
       }

       post.add(v);
       reversePost.add(v);

    }

    public Iterable<Integer> pre()
    {
        return pre;
    }

    public Iterable<Integer> post()
    {
        return post;
    }

    public Iterable<Integer> reversePost()
    {
        return reversePost;
    }

}
