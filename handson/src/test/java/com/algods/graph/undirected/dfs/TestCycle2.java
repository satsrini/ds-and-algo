package com.algods.graph.undirected.dfs;

import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.undirected.Graph;

public class TestCycle2 {
	
	private Graph graph;

	@Before
	public void setUp()
	{
		graph = new Graph(13);
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 4);
		graph.addEdge(4, 5);
		graph.addEdge(1, 3);
		graph.addEdge(2, 8);
		graph.addEdge(4, 11);
		graph.addEdge(4, 12);
		graph.addEdge(5, 6);
		graph.addEdge(3, 7);
		graph.addEdge(8, 10);
		graph.addEdge(8, 9);
		
	}
	
	@Test
	public void testCycle()
	{
		Cycle cycle = new Cycle(graph);
		
		assertFalse(cycle.hasCycle());
		
	}

}

