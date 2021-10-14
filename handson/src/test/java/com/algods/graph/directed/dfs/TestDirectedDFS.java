package com.algods.graph.directed.dfs;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.directed.DiGraph;

import java.util.List;

public class TestDirectedDFS
{
	private DiGraph g;
	

	@Before
	public void setUp()
	{
		g = new DiGraph(13);
		g.addEdge(4,2);
		g.addEdge(2,3);
		g.addEdge(3,2);
		g.addEdge(6,0);
		g.addEdge(0,1);
		g.addEdge(2,0);
		g.addEdge(11,12);
		g.addEdge(12,9);
		g.addEdge(9,10);
		g.addEdge(9,11);
                g.addEdge(8,9);
                g.addEdge(10,12);
                g.addEdge(11,4);
                g.addEdge(4,3);
                g.addEdge(3,5);
                g.addEdge(7,8);
                g.addEdge(8,7);
	        g.addEdge(5,4);
                g.addEdge(0,5);
                g.addEdge(6,4);
                g.addEdge(6,9);
                g.addEdge(7,6);	
	}
	
	@Test
	public void testDiGraphConnected1()
	{
                DirectedDFS directedDFS = new DirectedDFS(g,0);
                assertTrue(directedDFS.marked(2));
                assertFalse(directedDFS.marked(6));
                assertFalse(directedDFS.marked(10));
	}

        @Test
        public void testDiGraphConnected2()
        {

                List<Integer> list = List.of(0,8);
                DirectedDFS directedDFS = new DirectedDFS(g, list);
                assertTrue(directedDFS.marked(6));

        }
}

