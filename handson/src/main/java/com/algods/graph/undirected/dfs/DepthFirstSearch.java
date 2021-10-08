package com.algods.graph.undirected.dfs;

import com.algods.graph.undirected.Graph;

/**
  * <h1>DepthFirstSearch</h1>
  * This class is an implementation for Depth First Search Algorithm
  * <p> Implementation for Depth First Search algorithm in Java
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-08
  */


public class DepthFirstSearch 
{
	private boolean[] marked;
	private int count;
	
	public DepthFirstSearch(Graph g, int s)
	{
		marked = new boolean[g.V()];
		this.dfs(g, s);
	}
	
	private void dfs(Graph g,int v)
	{
		marked[v] = true;
		count++;
		
		for(int w:g.adj(v))
		{
			if(!marked[w])
			{
				dfs(g,w);
			}
		}
	}
	
	public boolean marked(int w)
	{
		return marked[w];
	}
	
	public int count()
	{
		return count;
	}
}

