package com.algods.graph.directed.scc;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.directed.DiGraph;
import com.algods.graph.directed.scc.TransitiveClosure;


public class TestTransitiveClosure
{
        private DiGraph g2;
	

	@Before
	public void setUp()
	{
                // this is a cyclic Directed Graph.
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
        public void testReachability()
        {
               TransitiveClosure transitiveClosure =
                                     new TransitiveClosure(g2);

               assertTrue(transitiveClosure.reachable(0,4));
               assertFalse(transitiveClosure.reachable(0,6));
               assertFalse(transitiveClosure.reachable(0,12));
               assertTrue(transitiveClosure.reachable(12,0));

        }

}

