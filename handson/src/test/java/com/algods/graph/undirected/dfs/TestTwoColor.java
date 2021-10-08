package com.algods.graph.undirected.dfs;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.undirected.Graph;

public class TestTwoColor 
{
	private Graph g;
	

	@Before
	public void setUp()
	{
		g = new Graph(10);
		g.addEdge(0,5);
		g.addEdge(0,6);
		g.addEdge(1,6);
		g.addEdge(1,7);
		g.addEdge(1,8);
		g.addEdge(2,7);
		g.addEdge(3,7);
		g.addEdge(3,9);
		g.addEdge(4,7);
		g.addEdge(4,9);

		
	}
	
	@Test
	public void testBipartite()
	{
		TwoColor twoColor = new TwoColor(g);

		assertTrue(twoColor.isBarpartite());
	}
	
	@Test
	public void testBipartiteFalse()
	{
		g.addEdge(3,4);
		TwoColor twoColor = new TwoColor(g);
		

		assertFalse(twoColor.isBarpartite());
	}	

}

