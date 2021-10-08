package com.algods.graph.undirected.cc;

import com.algods.graph.undirected.Graph;

/**
  * <h1>CC</h1>
  * This class is an implementation for Connected Component Algorithm
  * <p> Implementation for finding 'Connected Components in an undirected graph' algorithm in Java
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-08
  */


public class CC {
	
	private int id[];
	private boolean[] marked;
	int count = 0;
	

	public CC(Graph g)
	{
		id = new int[g.V()];
		marked = new boolean[g.V()];
		
		for(int s = 0; s < g.V(); s++)
		{
			if(!marked[s])
			{
				dfs(g,s);
				count++;
			}
		}
		
	}
	
	private void dfs(Graph g, int s)
	{
		marked[s] = true;
		id[s] = count;
		
		for(int k:g.adj(s))
		{
			if(!marked[k])
			{
				dfs(g,k);
			}
		}
		
	}
	
	public boolean connected(int v, int w)
	{
		return (id[v] == id[w]);
	}
	
	public int id(int v)
	{
		return id[v];
	}
	
	public int count()
	{
		return count;
	}
}

