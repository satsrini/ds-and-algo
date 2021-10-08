package com.algods.graph.undirected.dfs;

import com.algods.graph.undirected.Graph;

/**
  * <h1>Cycle</h1>
  * This class is an implementation for Cycle Algorithm
  * <p> Implementation for Cycle algorithm in Java
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-08
  */


public class Cycle
{
	private boolean[] marked;
	private boolean cycle = false;
	
	public Cycle(Graph g)
	{
		marked = new boolean[g.V()];
		
		for(int s = 0; s < g.V(); s++)
		{
			if(cycle)
			{
				break;
			}
			
			if(!marked[s])
			{
				dfs(g,s,s);
			}
		}
		
	}
	
	private void dfs(Graph g, int v, int w)
	{
		marked[v] = true;
		
		for(int k:g.adj(v))
		{
			if(!marked[k])
			{
				dfs(g,k,v);
			}else
			{
				if(k != w)
				{
					cycle = true;
					return;
				}
			}
		}
		
	}
	
	public boolean hasCycle()
	{
		return cycle;
	}
}

