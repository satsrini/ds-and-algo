package com.algods.graph.undirected.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.algods.graph.undirected.Graph;

/**
  * <h1>BreadthFirstPaths</h1>
  * This class is an implementation for Breadth First Paths Algorithm
  * <p> Implementation for Breadth First Paths algorithm in Java
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-08
  */


public class BreadthFirstPaths 
{
	private final int s;
	private boolean[] marked;
	private int[] edgeTo;
	
	public BreadthFirstPaths(Graph g, int s)
	{
		this.s = s;
		marked = new boolean[g.V()];
		edgeTo = new int[g.V()];
		this.bfs(g, s);
	}
	
	private void bfs(Graph g, int s)
	{
		Queue<Integer> queue = new LinkedList<>();
		queue.add(s);
		marked[s] = true;
		
		while(!queue.isEmpty())
		{
			int v = queue.remove();
			for(int k:g.adj(v))
			{
				if(!marked[k])
				{
					edgeTo[k] = v;
					marked[k] = true;
					queue.add(k);
				}
			}
		}
	}
	
	public boolean hasPathTo(int v)
	{
		if(v >= marked.length)
		{
			return false;
		}
		
		return marked[v];
	}
	
	public Iterable<Integer> pathTo(int v)
	{
		
		if(!hasPathTo(v))
		{
			return null;
		}
		
		Stack<Integer> stack = new Stack<>();
		
		int i = v;
		
		for(; i != s; i = edgeTo[i])
		{
			stack.push(i);
		}
		
		stack.push(i);
		
		return stack;
	}
	
}

