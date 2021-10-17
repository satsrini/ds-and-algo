package com.algods.graph.directed.dfs.dag;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.directed.DiGraph;
import com.algods.graph.directed.dfs.dag.DirectedCycle;


public class TestDirectedCycle
{
	private DiGraph g1;
	private DiGraph g2;

	@Before
	public void setUp()
	{
		g1 = new DiGraph(13);
		g1.addEdge(0,1);
		g1.addEdge(0,6);
		g1.addEdge(0,5);
		g1.addEdge(2,0);
		g1.addEdge(2,3);
		g1.addEdge(3,5);
		g1.addEdge(5,4);
		g1.addEdge(6,4);
		g1.addEdge(6,9);
		g1.addEdge(7,6);
                g1.addEdge(8,7);
                g1.addEdge(9,10);
                g1.addEdge(9,11);
                g1.addEdge(9,12);
                g1.addEdge(11,12);



                g2 = new DiGraph(13);
                g2.addEdge(0,1);
                g2.addEdge(0,5);
                g2.addEdge(2,0);
                g2.addEdge(2,3);
                g2.addEdge(3,2);
                g2.addEdge(3,5);
                g2.addEdge(4,2);
                g2.addEdge(4,3);
                g2.addEdge(5,4);
                g2.addEdge(6,0);
                g2.addEdge(6,4);
                g2.addEdge(6,9);
                g2.addEdge(7,6);
                g2.addEdge(7,8);
                g2.addEdge(8,7);
                g2.addEdge(8,9);
                g2.addEdge(9,10);
                g2.addEdge(9,11);
                g2.addEdge(10,12);
                g2.addEdge(11,4);
                g2.addEdge(11,12);
                g2.addEdge(12,9);
	}

        @Test
        public void testHasCycle()
        {
              DirectedCycle directedCycle1 = new DirectedCycle(g1);
              DirectedCycle directedCycle2 = new DirectedCycle(g2);

              assertFalse(directedCycle1.hasCycle());
              assertTrue(directedCycle2.hasCycle());

        }

        @Test
        public void testPrintCycle()
        {
             DirectedCycle directedCycle2 = new DirectedCycle(g2);

             System.out.println("\n\n\n");

             for(int k:directedCycle2.cycle())
             {
                System.out.print(k + " ");
             }
             System.out.println("\n\n\n");

        }
}

