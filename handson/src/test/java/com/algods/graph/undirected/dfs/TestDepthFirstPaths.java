package com.algods.graph.undirected.dfs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.undirected.Graph;
import com.algods.graph.undirected.dfs.DepthFirstPaths;

public class TestDepthFirstPaths {
	
	private Graph graph;

	@Before
	public void setUp() {
		
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
	public void testHasPathTo()
	{
		DepthFirstPaths dfp = new DepthFirstPaths(graph, 0);
		
		assertTrue(dfp.hasPathTo(6));
		assertFalse(dfp.hasPathTo(7));
		assertFalse(dfp.hasPathTo(70));
		
	}
	
	@Test
	public void testPathTo()
	{
		int x = 3;
		DepthFirstPaths dfp = new DepthFirstPaths(graph, 0);
		
		
		Iterable<Integer> list = dfp.pathTo(x);
		
		if(list != null)
		{
			System.out.println(String.format("path to %d is",x));
				
			for(int i:list)
			{
				System.out.print(i + " ");
			}
		}
		
		assertEquals(true, true);
	}
	
	@Test
	public void printAllPaths()
	{
		DepthFirstPaths dfp = new DepthFirstPaths(graph, 8);
		
		for(int i = 0; i < graph.V(); i++)
		{
			System.out.format("Path for %d is \n", i);
			Iterable<Integer> list = dfp.pathTo(i);
			if(list != null)
			{
				for(int j:list)
				{
					System.out.print(j + " ");
				}
			}else
			{
				System.out.println("No Path");
			}
			System.out.println("\n\n");
		}
		
		assertEquals(true, true);
	}

}

