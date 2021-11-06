package com.algods.graph.shortestpath;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.shortestpath.EdgeWeightedDiGraph;
import com.algods.graph.shortestpath.DirectedEdge;

public class TestEdgeWeightedDiGraph
{

        private EdgeWeightedDiGraph g;


	@Before
	public void setUp()
	{
           g = new EdgeWeightedDiGraph(8);

           g.addEdge(new DirectedEdge(4,5,0.35));
           g.addEdge(new DirectedEdge(5,4,0.35));
           g.addEdge(new DirectedEdge(4,7,0.37));
           g.addEdge(new DirectedEdge(5,7,0.28));
           g.addEdge(new DirectedEdge(7,5,0.28));
           g.addEdge(new DirectedEdge(5,1,0.32));
           g.addEdge(new DirectedEdge(0,4,0.38));
           g.addEdge(new DirectedEdge(0,2,0.26));
           g.addEdge(new DirectedEdge(7,3,0.39));
           g.addEdge(new DirectedEdge(1,3,0.29));
           g.addEdge(new DirectedEdge(2,7,0.34));
           g.addEdge(new DirectedEdge(6,2,0.40));
           g.addEdge(new DirectedEdge(3,6,0.52));
           g.addEdge(new DirectedEdge(6,0,0.58));
           g.addEdge(new DirectedEdge(6,4,0.93));

        }

        @Test
        public void testDiGraph1()
        {
           assertEquals(Integer.valueOf(8), Integer.valueOf(g.V()));
           assertEquals(Integer.valueOf(15), Integer.valueOf(g.E()));
        }

        @Test
        public void testPrintDiGraph()
        {
           System.out.println("\n\n");
           System.out.println("Directed Edges:");

           System.out.println(g.toString());
           System.out.println("\n\n");

           assertEquals(true,true);
        }

        @Test
        public void testPrintAdj()
        {
           System.out.println("\n\n");
           System.out.println("Adjacent Directed Edges:");
           for(DirectedEdge e:g.adj(7))
           {
              System.out.println(e.toString());
           }
           System.out.println("\n\n");

           assertEquals(true,true);
        }



}
