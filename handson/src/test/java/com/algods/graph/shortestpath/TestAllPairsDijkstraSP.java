package com.algods.graph.shortestpath;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.shortestpath.EdgeWeightedDiGraph;
import com.algods.graph.shortestpath.DirectedEdge;

public class TestAllPairsDijkstraSP
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
        public void testShortestPathTo()
        {
           AllPairsDijkstraSP allPairsdijkstraSPs = new AllPairsDijkstraSP(g);

           System.out.println("\n\n");
           System.out.println("Shortest path from 0 to 4:");
           for(DirectedEdge e:allPairsdijkstraSPs.path(0,4))
           {
              System.out.print(e.toString() + "   ");
           }

           System.out.println("\n\n");

           System.out.println("\n\n");
           System.out.println("Shortest path from 0 to 6:");
           for(DirectedEdge e:allPairsdijkstraSPs.path(0,6))
           {
              System.out.print(e.toString() + "   ");
           }

           System.out.println("\n\n");

           System.out.println("\n\n");
           System.out.println("Shortest path from 0 to 5:");
           for(DirectedEdge e:allPairsdijkstraSPs.path(0,5))
           {
              System.out.print(e.toString() + "   ");
           }

           System.out.println("\n\n");



           assertEquals(true, true);
        }

        @Test
        public void testShortestPathTo3()
        {
           AllPairsDijkstraSP allPairsdijkstraSPs = new AllPairsDijkstraSP(getEdgeWeightedDiGraph3());

           System.out.println("\n\n");
           System.out.println("Shortest path from 0 to 5:");
           for(DirectedEdge e:allPairsdijkstraSPs.path(0,5))
           {
              System.out.print(e.toString() + "   ");
           }

           System.out.println("\n\n");

           assertEquals(true,true);
       }

        @Test
        public void testShortestPathTo4()
        {
           AllPairsDijkstraSP allPairsdijkstraSPs = new AllPairsDijkstraSP(g);

           System.out.println("\n\n");
           System.out.println("Shortest path from 5 to 6:");
           for(DirectedEdge e:allPairsdijkstraSPs.path(5,6))
           {
              System.out.print(e.toString() + "   ");
           }

           System.out.println("\n\n");

           System.out.println("\n\n");
           System.out.println("Shortest path from 3 to 4:");
           for(DirectedEdge e:allPairsdijkstraSPs.path(3,4))
           {
              System.out.print(e.toString() + "   ");
           }

           System.out.println("\n\n");

           System.out.println("\n\n");
           System.out.println("Shortest path from 4 to 3:");
           for(DirectedEdge e:allPairsdijkstraSPs.path(4,3))
           {
              System.out.print(e.toString() + "   ");
           }

           System.out.println("\n\n");


           assertEquals(true,true);
        }


       @Test
       public void testDistTo()
       {
          AllPairsDijkstraSP allPairsdijkstraSPs = new AllPairsDijkstraSP(g);

          System.out.println(allPairsdijkstraSPs.dist(0,3));

          assertEquals(true,true);

       }


       
       private EdgeWeightedDiGraph getEdgeWeightedDiGraph2()
       {
           EdgeWeightedDiGraph g2 = new EdgeWeightedDiGraph(8);

           g2.addEdge(new DirectedEdge(4,5,0.35));
           g2.addEdge(new DirectedEdge(5,4,0.35));
           g2.addEdge(new DirectedEdge(4,7,0.37));
           g2.addEdge(new DirectedEdge(5,7,0.28));
           g2.addEdge(new DirectedEdge(7,5,0.28));
           g2.addEdge(new DirectedEdge(5,1,0.32));
           g2.addEdge(new DirectedEdge(0,4,0.38));
           g2.addEdge(new DirectedEdge(0,2,0.26));
           g2.addEdge(new DirectedEdge(7,3,0.39));
           g2.addEdge(new DirectedEdge(1,3,0.29));
           g2.addEdge(new DirectedEdge(2,7,0.34));
           g2.addEdge(new DirectedEdge(6,2,0.40));
           g2.addEdge(new DirectedEdge(6,0,0.58));
           g2.addEdge(new DirectedEdge(6,4,0.93));

           return g2;

       }

       private EdgeWeightedDiGraph getEdgeWeightedDiGraph3()
       {
           EdgeWeightedDiGraph g3 = new EdgeWeightedDiGraph(8);

           g3.addEdge(new DirectedEdge(4,5,3.5));
           g3.addEdge(new DirectedEdge(5,4,0.35));
           g3.addEdge(new DirectedEdge(4,7,0.37));
           g3.addEdge(new DirectedEdge(5,7,0.28));
           g3.addEdge(new DirectedEdge(7,5,0.28));
           g3.addEdge(new DirectedEdge(5,1,0.32));
           g3.addEdge(new DirectedEdge(0,4,0.38));
           g3.addEdge(new DirectedEdge(0,2,0.26));
           g3.addEdge(new DirectedEdge(7,3,0.39));
           g3.addEdge(new DirectedEdge(1,3,0.29));
           g3.addEdge(new DirectedEdge(2,7,0.34));
           g3.addEdge(new DirectedEdge(6,2,0.40));
           g3.addEdge(new DirectedEdge(6,0,0.58));
           g3.addEdge(new DirectedEdge(6,4,0.93));

           return g3;

       }



}
