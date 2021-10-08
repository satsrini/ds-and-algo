package com.algods.graph.undirected;

import com.algods.graph.beans.Bag;

/**
  * <h1>Graph</h1>
  * This class is an implementation for Graph Data Structure
  * <p> Implementation for Graph Data Structure in Java
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-08
  */


public class Graph {

	private int V;
	private int E;
	private Bag<Integer>[] adj;
	
	public Graph(int V) 
	{
		this.V = V;
		this.E = 0;
		adj = (Bag<Integer>[]) new Bag[V];
		
		for(int i = 0; i < V; i++)
		{
			adj[i] = new Bag<>();
		}
	}
	
	public void addEdge(int v, int w) 
	{
		adj[v].add(w);
		adj[w].add(v);
		this.E++;
	}
	
	public int V()
	{
		return V;
	}
	
	public int E()
	{
		return E;
	}
	
	public Iterable<Integer> adj(int v)
	{
		return adj[v];
	}
	
	public static int degree(Graph g, int v)
	{
		int degree = 0;
		
		for(int i:g.adj(v))
		{
			degree++;
		}
		
		return degree;
	}
	
	public static int maxDegree(Graph g)
	{
		int maxDegree = 0;
		
		for(int i = 0; i < g.V(); i++)
		{
			int tmpDegree = degree(g,i);
			if(tmpDegree > maxDegree) 
			{
				maxDegree = tmpDegree;
			}
		}
		
		return maxDegree;
	}
	
	public static int AvgDegree(Graph g)
	{
		return 2*g.E()/g.V();
	}
	
	public static int noOfSelfLoops(Graph g)
	{
		int count = 0;
		
		for(int v = 0; v < g.V(); v++)
		{
			for(int w:g.adj(v))
			{
				if(v == w)
				{
					count++;
				}
			}
		}
		
		return count/2;
	}
	
	public String toString()
	{
		StringBuffer s = new StringBuffer();
		
		s.append(String.format("vertices:%s Edges:%s",this.V(), this.E()));
		s.append("\n");
		
		for(int v = 0; v < this.V(); v++)
		{
			s.append(v+":");
			for(int w:this.adj(v))
			{
				s.append(w + " ");
			}
			s.append("\n");
		}
		
		return s.toString();
	}
	
	public boolean isEdge(int v, int w)
	{
		if(v < 0 || v >= this.V())
		{
			return false;
		}
		
		return this.adj[v].contains(w);
	}
	
	
}

