package com.algods.graph.shortestpath.acyclic;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.shortestpath.EdgeWeightedDiGraph;
import com.algods.graph.shortestpath.DirectedEdge;
import com.algods.graph.shortestpath.acyclic.TopologicalEdgeWeighted;


public class TestTopologicalEdgeWeighted
{

        private EdgeWeightedDiGraph g1;


	@Before
	public void setUp()
	{
            g1 = getAcyclic();
        }

        @Test
        public void testTopologicalOrder()
        {
            TopologicalEdgeWeighted topologicalEdgeWeighted
                                       = new TopologicalEdgeWeighted(g1);

            assertTrue(topologicalEdgeWeighted.isDAG());

            System.out.println("\n\n");
            System.out.println("Topological Order: ");

            for(int k:topologicalEdgeWeighted.order())
            {
                System.out.print(k + " ");
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

}
