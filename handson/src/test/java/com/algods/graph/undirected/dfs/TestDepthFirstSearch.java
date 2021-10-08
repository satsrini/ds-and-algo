package com.algods.graph.undirected.dfs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.undirected.Graph;
import com.algods.graph.undirected.dfs.DepthFirstSearch;

public class TestDepthFirstSearch {

	private Graph graph;

	@Before
	public void setUp()
	{
		graph = new Graph(13);
		
		graph.addEdge(0, 5);
		graph.addEdge(4, 3);
		graph.addEdge(0, 1);
		graph.addEdge(9, 12);
		graph.addEdge(6, 4);
		graph.addEdge(5, 4);
		graph.addEdge(0, 2);
		graph.addEdge(11, 12);
		graph.addEdge(9, 10);
		graph.addEdge(0, 6);
		graph.addEdge(7, 8);
		graph.addEdge(9, 11);
		graph.addEdge(5, 3);
		
	}
	
	@Test
	public void testDFS1()
	{
		DepthFirstSearch dfs = new DepthFirstSearch(graph, 6);
		
		assertTrue(dfs.marked(3));
		assertFalse(dfs.marked(7));
		assertEquals(Integer.valueOf(7), Integer.valueOf(dfs.count()));
	}
	
	@Test
	public void testDFS2()
	{
		int k = 6;
		DepthFirstSearch dfs = new DepthFirstSearch(graph, k);
		
		int v = graph.V();
		
		for(int i=0; i < v; i++)
		{
			if(dfs.marked(i))
			{
				System.out.println(String.format("%d is connected to %d", i,k));
			}else
			{
				System.out.println(String.format("%d is not connected to %d", i,k));
			}
		}
		
		System.out.println("\n\n");
		
		if(dfs.count() == v)
		{
			System.out.println("It is a connected graph");
		}else
		{
			System.out.println("It is not a connected graph");
		}
		
		
	}

}

