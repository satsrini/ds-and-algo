package com.algods.graph.shortestpath;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.shortestpath.DirectedEdge;

public class TestDirectedEdge
{

        private DirectedEdge e1;
        private DirectedEdge e2;


	@Before
	public void setUp()
	{

           e1 = new DirectedEdge(4,5,0.35);
           e2 = new DirectedEdge(4,5,0.35);

        }

        @Test
        public void testEqualUnEqual()
        {
           assertTrue(e1.equals(e2));
           e2 = null;
           assertFalse(e1.equals(e2));
           e2 = new DirectedEdge(5,5,0.35);
           assertFalse(e1.equals(e2));
           e2 = new DirectedEdge(4,5,0.355);
           assertFalse(e1.equals(e2));
           assertTrue(e2.equals(e2));
           e2 = new DirectedEdge(5,4,0.35);
           assertFalse(e1.equals(e2));
        }

}
