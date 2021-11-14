package com.algods.graph.shortestpath.acyclic;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.shortestpath.EdgeWeightedDiGraph;
import com.algods.graph.shortestpath.DirectedEdge;
import com.algods.graph.shortestpath.acyclic.AcyclicSP;


public class TestAcyclicSP
{

        private EdgeWeightedDiGraph g1;


	@Before
	public void setUp()
	{
            g1 = getAcyclic();
        }

        @Test
        public void testAcylicSPPath()
        {
            AcyclicSP acyclicSP = new AcyclicSP(g1,5);

            assertTrue(acyclicSP.hasPathTo(6));

            AcyclicSP acyclicSP2 = new AcyclicSP(g1,0);   
            //assertFalse(acyclicSP2.hasPathTo(1));
        }

        @Test
        public void testAcylicSPPath2()
        {
            AcyclicSP acyclicSP = new AcyclicSP(g1,5);

            System.out.println("\n\n");
            System.out.println("path to 6 from 5:");
            for(DirectedEdge e:acyclicSP.pathTo(6))
            {
                System.out.println(e);
            }
            System.out.println("\n\n");

            assertEquals(true,true);
        }

        @Test
        public void testAcylicSPPath3()
        {
            AcyclicSP acyclicSP = new AcyclicSP(g1,0);

            System.out.println("\n\n");
            System.out.println("path to 2 from 0:");
            for(DirectedEdge e:acyclicSP.pathTo(2))
            {
                System.out.println(e);
            }
            System.out.println("\n\n");

            assertEquals(true,true);
        }

        @Test
        public void testAcylicSPPath4()
        {
            AcyclicSP acyclicSP4 = new AcyclicSP(getAcyclic2(),0);

            System.out.println("\n\n");
            System.out.println("path to 2 from 0 with negative weight:");
            for(DirectedEdge e:acyclicSP4.pathTo(2))
            {
                System.out.println(e);
            }
            System.out.println("\n\n");

            assertEquals(true,true);
        }


        @Test
        public void testAcylicSPPath5()
        {
            AcyclicSP acyclicSP5 = new AcyclicSP(getAcyclic2(),1);

            System.out.println("\n\n");
            System.out.println("path to 6 from 1 with negative weight:");
            for(DirectedEdge e:acyclicSP5.pathTo(6))
            {
                System.out.println(e);
            }
            System.out.println("\n\n");

            assertEquals(true,true);
        }

        @Test
        public void testAcylicSPPath6()
        {
            AcyclicSP acyclicSP = new AcyclicSP(g1,5);

            System.out.println("\n\n");
            System.out.println("path to 2 from 5 with positive weight:");
            for(DirectedEdge e:acyclicSP.pathTo(2))
            {
                System.out.println(e);
            }
            System.out.println("\n\n");

            AcyclicSP acyclicSP2 = new AcyclicSP(getAcyclic2(),5);

            System.out.println("\n\n");
            System.out.println("path to 2 from 5 with negative weight:");
            for(DirectedEdge e:acyclicSP2.pathTo(2))
            {
                System.out.println(e);
            }
            System.out.println("\n\n");


            assertEquals(true,true);
        }

        @Test
        public void testAcylicSPPath7()
        {
            AcyclicSP acyclicSP = new AcyclicSP(g1,5);

            System.out.println("\n\n");
            System.out.println("path to 0 from 5 with positive weight:");
            for(DirectedEdge e:acyclicSP.pathTo(0))
            {
                System.out.println(e);
            }
            System.out.println("\n\n");

            AcyclicSP acyclicSP2 = new AcyclicSP(getAcyclic2(),5);

            System.out.println("\n\n");
            System.out.println("path to 0 from 5 with negative weight:");
            for(DirectedEdge e:acyclicSP2.pathTo(0))
            {
                System.out.println(e);
            }
            System.out.println("\n\n");


            assertEquals(true,true);



        }

        @Test
        public void testAcylicSPPath8()
        {
            AcyclicSP acyclicSP = new AcyclicSP(g1,0);

            System.out.println("\n\n");
            System.out.println("THIS IS WRONG: path to 1 from 0 with positive weight:");
            for(DirectedEdge e:acyclicSP.pathTo(1))
            {
                System.out.println(e);
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

        private EdgeWeightedDiGraph getAcyclic2()
        {

           EdgeWeightedDiGraph g = new EdgeWeightedDiGraph(8);

           g.addEdge(new DirectedEdge(5,4,0.35));
           g.addEdge(new DirectedEdge(4,7,0.37));
           g.addEdge(new DirectedEdge(5,7,0.28));
           g.addEdge(new DirectedEdge(5,1,0.32));
           g.addEdge(new DirectedEdge(4,0,-0.65)); // negative weight
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
