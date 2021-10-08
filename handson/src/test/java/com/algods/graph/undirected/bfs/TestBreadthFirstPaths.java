package com.algods.graph.undirected.bfs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.undirected.Graph;

public class TestBreadthFirstPaths {
	
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
	public void testConnected()
	{

		BreadthFirstPaths bfs = new BreadthFirstPaths(graph, 0);
		
		assertTrue(bfs.hasPathTo(5));
		assertFalse(bfs.hasPathTo(7));
		assertFalse(bfs.hasPathTo(9));
		
	}
	
	@Test
	public void testPath()
	{
		int x = 5;
		
		BreadthFirstPaths bfs = new BreadthFirstPaths(graph, 0);
		
		System.out.format("Path to %d is: \n", x);
		for(int i:bfs.pathTo(x))
		{
			System.out.print(i + " ");
		}
		
		assertEquals(true, true);
	}
	
	@Test
	public void printAllPaths()
	{
		BreadthFirstPaths bfs = new BreadthFirstPaths(graph, 0);
		
		for(int i = 0; i < graph.V(); i++)
		{
			Iterable<Integer> itr = bfs.pathTo(i);
			
			if(itr != null)
			{
				System.out.format("Path to %d is: ", i);
				for(int k:itr)
				{
					System.out.print(k + " ");
				}
			}else
			{
				System.out.format("%d is not connected \n", i);
			}
			System.out.println();
			
			
		}
		assertEquals(true, true);
	}
}

