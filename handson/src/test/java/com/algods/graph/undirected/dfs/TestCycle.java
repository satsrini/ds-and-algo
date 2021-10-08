package com.algods.graph.undirected.dfs;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.undirected.Graph;

public class TestCycle {
	
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
	public void testCycle()
	{
		Cycle cycle = new Cycle(graph);
		
		assertTrue(cycle.hasCycle());
		
	}

}

