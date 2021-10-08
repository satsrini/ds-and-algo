package com.algods.graph.undirected.dfs;

import java.util.Stack;
import com.algods.graph.undirected.Graph;

/**
  * <h1>DepthFirstPaths</h1>
  * This class is an implementation for Depth First Paths Algorithm
  * <p> Implementation for Depth First Paths algorithm in Java
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-08
  */


public class DepthFirstPaths {
	
	private boolean[] marked;
	private final int s;
	private int[] edgeTo;
	
	public DepthFirstPaths(Graph g, int s)
	{
		marked = new boolean[g.V()];
		edgeTo = new int[g.V()];
		this.s = s;
		this.dfs(g, this.s);
	}
	
	private void dfs(Graph g, int v)
	{
		marked[v] = true;
		
		for(int w:g.adj(v))
		{
			if(!marked[w])
			{
				edgeTo[w] = v;
				dfs(g,w);
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
		
		for(; i != s ; i = edgeTo[i])
		{
			stack.push(i);
		}
		
		stack.push(i);
		
		return stack;
	}
}

