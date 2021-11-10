package com.algods.graph.shortestpath.acyclic;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.shortestpath.EdgeWeightedDiGraph;
import com.algods.graph.shortestpath.DirectedEdge;
import com.algods.graph.shortestpath.acyclic.DirectedCycleEdgeWeighted;


public class TestDirectedCycleEdgeWeighted
{

        private EdgeWeightedDiGraph g1;
        private EdgeWeightedDiGraph g2;


	@Before
	public void setUp()
	{
            g1 = getAcyclic();
            g2 = getCyclic1();
        }

        @Test
        public void testAcyclic()
        {
            DirectedCycleEdgeWeighted directedCycleEdgeWeighted
                                       = new DirectedCycleEdgeWeighted(g1);

            assertFalse(directedCycleEdgeWeighted.hasCycle());
        }

        @Test
        public void testCyclic1()
        {

            DirectedCycleEdgeWeighted directedCycleEdgeWeighted
                                       = new DirectedCycleEdgeWeighted(g2);

            assertTrue(directedCycleEdgeWeighted.hasCycle());

            System.out.println("\n\n");
            System.out.println("Printing cycle:");

            for(DirectedEdge e:directedCycleEdgeWeighted.cycle())
            {
               System.out.println(e.toString());
            }

            System.out.println("\n\n");

            assertEquals(true,true);

        }

        @Test
        public void testCyclic2()
        {

            DirectedCycleEdgeWeighted directedCycleEdgeWeighted
                                       = new DirectedCycleEdgeWeighted(getCyclic2());

            assertTrue(directedCycleEdgeWeighted.hasCycle());

            System.out.println("\n\n");
            System.out.println("Printing cycle:");

            for(DirectedEdge e:directedCycleEdgeWeighted.cycle())
            {
               System.out.println(e.toString());
            }

            System.out.println("\n\n");

            assertEquals(true,true);

        }



        private EdgeWeightedDiGraph getAcyclic()
        {

           EdgeWeightedDiGraph g = new EdgeWeightedDiGraph(8);

           g.addEdge(new DirectedEdge(5,4,0.35));
           g.addEdge(new DirectedEdge(4,7,0.37));
           g.addEdge(new DirectedEdge(5,7,0.28));
           g.addEdge(new DirectedEdge(5,1,0.32));
           g.addEdge(new DirectedEdge(4,0,0.38));
           g.addEdge(new DirectedEdge(0,2,0.26));
           g.addEdge(new DirectedEdge(3,7,0.39));
           g.addEdge(new DirectedEdge(1,3,0.29));
           g.addEdge(new DirectedEdge(7,2,0.34));
           g.addEdge(new DirectedEdge(6,2,0.40));
           g.addEdge(new DirectedEdge(3,6,0.52));
           g.addEdge(new DirectedEdge(6,0,0.58));
           g.addEdge(new DirectedEdge(6,4,0.93));


           return g;

        }

        private EdgeWeightedDiGraph getCyclic1()
        {

           EdgeWeightedDiGraph g = new EdgeWeightedDiGraph(8);

           g.addEdge(new DirectedEdge(5,4,0.35));
           g.addEdge(new DirectedEdge(4,7,0.37));
           g.addEdge(new DirectedEdge(5,7,0.28));
           g.addEdge(new DirectedEdge(5,1,0.32));
           g.addEdge(new DirectedEdge(4,0,0.38));
           g.addEdge(new DirectedEdge(0,2,0.26));
           g.addEdge(new DirectedEdge(3,7,0.39));
           g.addEdge(new DirectedEdge(1,3,0.29));
           g.addEdge(new DirectedEdge(7,2,0.34));
           g.addEdge(new DirectedEdge(6,2,0.40));
           g.addEdge(new DirectedEdge(3,6,0.52));
           g.addEdge(new DirectedEdge(6,0,0.58));
           g.addEdge(new DirectedEdge(6,4,0.93));

           // adding a cycle
           g.addEdge(new DirectedEdge(2,5,0.75));


           return g;

        }


        private EdgeWeightedDiGraph getCyclic2()
        {

           EdgeWeightedDiGraph g = new EdgeWeightedDiGraph(8);

           g.addEdge(new DirectedEdge(5,4,0.35));
           g.addEdge(new DirectedEdge(4,7,0.37));
           g.addEdge(new DirectedEdge(5,7,0.28));
           g.addEdge(new DirectedEdge(5,1,0.32));
           g.addEdge(new DirectedEdge(4,0,0.38));
           g.addEdge(new DirectedEdge(0,2,0.26));
           g.addEdge(new DirectedEdge(3,7,0.39));
           g.addEdge(new DirectedEdge(1,3,0.29));
           g.addEdge(new DirectedEdge(7,2,0.34));
           g.addEdge(new DirectedEdge(6,2,0.40));
           g.addEdge(new DirectedEdge(3,6,0.52));
           g.addEdge(new DirectedEdge(6,0,0.58));
           g.addEdge(new DirectedEdge(6,4,0.93));

           // adding a cycle
           g.addEdge(new DirectedEdge(3,5,0.75));


           return g;

        }


}
