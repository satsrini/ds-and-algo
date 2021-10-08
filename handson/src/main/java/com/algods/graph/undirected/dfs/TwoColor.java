package com.algods.graph.undirected.dfs;

import com.algods.graph.undirected.Graph;

/**
  * <h1>Cycle</h1>
  * This class is an implementation for Bipartite Algorithm
  * <p> Implementation for Bipartite(Two color) algorithm in Java
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-08
  */


public class TwoColor {
	
	private boolean[] marked;
	private boolean[] color;
	private boolean isTwoColorable = true;

	public TwoColor(Graph g)
	{
		marked = new boolean[g.V()];
		color = new boolean[g.V()];
		
		for(int s = 0; s < g.V(); s++)
		{
			if(!isTwoColorable)
			{
				break;
			}
			
			if(!marked[s])
			{
				this.dfs(g, s);
			}
		}
	}
	
	private void dfs(Graph g, int v)
	{
		marked[v] = true;
		
		for(int k:g.adj(v))
		{
			if(!marked[k])
			{
				color[k] = !color[v];
				dfs(g,k);
			}else
			{
				if(color[k] == color[v]) // vertices k and v are connected by a single edge, hence colors should be different.
				{
					isTwoColorable = false;
					return;
				}
			}
		}
		
	}
	
	public boolean isBarpartite()
	{
		return isTwoColorable;
	}
}

