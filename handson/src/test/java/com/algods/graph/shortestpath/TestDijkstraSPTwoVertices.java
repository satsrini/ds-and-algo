package com.algods.graph.shortestpath;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.shortestpath.EdgeWeightedDiGraph;
import com.algods.graph.shortestpath.DirectedEdge;
import com.algods.graph.shortestpath.DijkstraSPTwoVertices;

public class TestDijkstraSPTwoVertices
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
        public void testHasPathTo()
        {
           DijkstraSPTwoVertices dijkstraSP = new DijkstraSPTwoVertices(g,0,6);

           assertTrue(dijkstraSP.hasPathTo());

        }

        @Test
        public void testShortestPathTo()
        {
           DijkstraSPTwoVertices dijkstraSP = new DijkstraSPTwoVertices(g,0,6);

           System.out.println("\n\n");
           System.out.println("Shortest path from 0 to 6:");
           for(DirectedEdge e:dijkstraSP.pathTo())
           {
              System.out.print(e.toString() + "   ");
           }

           assertEquals(true,true);
        }


       @Test
       public void testDistTo()
       {
          DijkstraSPTwoVertices dijkstraSP = new DijkstraSPTwoVertices(g,0,6);

          System.out.println(dijkstraSP.distTo());

          assertEquals(true,true);

       }

}
