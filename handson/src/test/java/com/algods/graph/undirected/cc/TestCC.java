package com.algods.graph.undirected.cc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.beans.Bag;
import com.algods.graph.undirected.Graph;

public class TestCC {

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
		CC cc = new CC(graph);
		
		assertTrue(cc.connected(0, 2));
		assertTrue(cc.connected(11, 9));
		assertFalse(cc.connected(7, 6));
		
	}
	
	@Test
	public void printAllConnectedIds()
	{
		CC cc = new CC(graph);
		
		Bag<Integer>[] connections = new Bag[cc.count()];
		
		for(int i = 0; i < connections.length; i++)
		{
			connections[i] = new Bag<>();
		}
		
		for(int i = 0; i < graph.V(); i++)
		{
			connections[cc.id(i)].add(i);
		}
		
		for(int i = 0; i < connections.length; i++)
		{
			System.out.format("Connections for index %d: ", i);
			for(int k:connections[i])
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		assertEquals(true, true);
	}

}

