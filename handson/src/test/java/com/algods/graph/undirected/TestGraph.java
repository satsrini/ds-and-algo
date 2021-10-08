package com.algods.graph.undirected;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestGraph {
	
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
	public void testUndirectedGraph()
	{
		assertTrue(graph.isEdge(0, 5));
		assertTrue(graph.isEdge(0, 1));
		assertTrue(graph.isEdge(0, 2));
		assertTrue(graph.isEdge(0, 6));
		
		assertTrue(graph.isEdge(5, 0));
		assertTrue(graph.isEdge(1, 0));
		assertTrue(graph.isEdge(2, 0));
		assertTrue(graph.isEdge(6, 0));
		
		assertFalse(graph.isEdge(6, 7));
		
		assertFalse(graph.isEdge(15, 2));
				
		System.out.println(graph.toString());
		
	}

}

