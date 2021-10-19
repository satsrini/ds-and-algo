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
}

