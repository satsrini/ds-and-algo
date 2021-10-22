package com.algods.graph.directed.order;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.directed.DiGraph;
import com.algods.graph.directed.order.DepthFirstOrder;

import java.util.List;

public class TestDepthFirstOrder
{
	private DiGraph g;
        private DiGraph g2;
	

	@Before
	public void setUp()
	{
		g = new DiGraph(13);

		g.addEdge(0,1);
		g.addEdge(0,5);
		g.addEdge(0,6);
		g.addEdge(2,0);
		g.addEdge(2,3);
		g.addEdge(3,5);
		g.addEdge(5,4);
		g.addEdge(6,4);
		g.addEdge(6,9);
		g.addEdge(7,6);
                g.addEdge(8,7);
                g.addEdge(9,10);
                g.addEdge(9,11);
                g.addEdge(9,12);
                g.addEdge(11,12);

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
        public void testPrintPre()
        {
           DepthFirstOrder depthFirstOrder = new DepthFirstOrder(g);

           System.out.println("\n\n");
           System.out.println("PRE");

           for(int k:depthFirstOrder.pre())
           {
                System.out.print(k + " ");
           }    

           System.out.println("\n\n");

           assertEquals(true,true);

        }

        @Test
        public void testPrintPost()
        {
           DepthFirstOrder depthFirstOrder = new DepthFirstOrder(g);

           System.out.println("\n\n");
           System.out.println("POST");

           for(int k:depthFirstOrder.post())
           {
                System.out.print(k + " ");
           }

           System.out.println("\n\n");

           assertEquals(true,true);

        }


        @Test
        public void testPrintReversePost()
        {
           DepthFirstOrder depthFirstOrder = new DepthFirstOrder(g);

           System.out.println("\n\n");
           System.out.println("REVERSE POST");

           for(int k:depthFirstOrder.reversePost())
           {
                System.out.print(k + " ");
           }

           System.out.println("\n\n");

           assertEquals(true,true);

        }

        @Test
        public void testPrintAllThree()
        {
           DepthFirstOrder depthFirstOrder = new DepthFirstOrder(g2.reverse());

           System.out.println("\n\n");
           System.out.println("PRE");
       
           for(int k:depthFirstOrder.pre())
           {
              System.out.println(k + " ");
           }

           System.out.println("\n\n");


           System.out.println("\n\n");
           System.out.println("POST");

           for(int l:depthFirstOrder.post())
           {
              System.out.println(l + " ");
           }

           System.out.println("\n\n");


           System.out.println("\n\n");
           System.out.println("REVERSE POST");

           for(int m:depthFirstOrder.reversePost())
           {
              System.out.println(m + " ");
           }

           System.out.println("\n\n");



           assertEquals(true,true);

        }
}

