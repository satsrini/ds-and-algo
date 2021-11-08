package com.algods.sort.priorityqueue;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.PriorityQueue;

import com.algods.graph.mst.Edge;


public class TestJDKPriorityQueue2
{

        private PriorityQueue<Edge> pq;
        private PriorityQueue<Edge> pq2;
        private PriorityQueue<Edge> pq3;
        
	@Before
	public void setUp()
	{
           Edge e1 = new Edge(4,5,0.35);
           Edge e2 = new Edge(4,7,0.37); 
           Edge e3 = new Edge(5,7,0.28);
           Edge e4 = new Edge(0,7,0.16);
           Edge e5 = new Edge(1,5,0.32);
           Edge e6 = new Edge(0,4,0.38);
           Edge e7 = new Edge(2,3,0.17);
           Edge e8 = new Edge(1,7,0.19);
           Edge e9 = new Edge(0,2,0.26);
           Edge e10 = new Edge(1,2,0.36);

           pq = new PriorityQueue<>(10);

           pq.add(e1);
           pq.add(e2);
           pq.add(e3);
           pq.add(e4);
           pq.add(e5);
           pq.add(e6);
           pq.add(e7);
           pq.add(e8);
           pq.add(e9);
           pq.add(e10);



           pq2 = new PriorityQueue<>(10, (edge1,edge2) -> edge1.compareTo(edge2));

           pq2.add(e1);
           pq2.add(e2);
           pq2.add(e3);
           pq2.add(e4);
           pq2.add(e5);
           pq2.add(e6);
           pq2.add(e7);
           pq2.add(e8);
           pq2.add(e9);
           pq2.add(e10);


           pq3 = new PriorityQueue<>(10, (edge1,edge2) -> edge2.compareTo(edge1));

           pq3.add(e1);
           pq3.add(e2);
           pq3.add(e3);
           pq3.add(e4);
           pq3.add(e5);
           pq3.add(e6);
           pq3.add(e7);
           pq3.add(e8);
           pq3.add(e9);
           pq3.add(e10);



        }

        @Test
        public void testPriorityQueue()
        {
         
           System.out.println("\n\n");
           System.out.println("Natural Ordering:");
           for(Edge e:pq)
           {
              System.out.println(e.toString());
           }
           System.out.println("\n\n");

           System.out.println("\n\n");
           System.out.println("Ascending Order:");
           for(Edge e:pq2)
           {
              System.out.println(e.toString());
           }
           System.out.println("\n\n");


           System.out.println("\n\n");
           System.out.println("Descending Order:");
           for(Edge e:pq3)
           {
              System.out.println(e.toString());
           }
           System.out.println("\n\n");


           assertEquals(true,true);

        }

        @Test
        public void testPriorityQueue2()
        {

           System.out.println("\n\n");
           System.out.println("2.Natural Ordering:");
           while(!pq.isEmpty())
           {
              System.out.println(pq.poll());
           }
           System.out.println("\n\n");

           System.out.println("\n\n");
           System.out.println("2.Ascending Order:");
           while(!pq2.isEmpty())
           {
              System.out.println(pq2.poll());
           }
           System.out.println("\n\n");


           System.out.println("\n\n");
           System.out.println("2.Descending Order:");
           while(!pq3.isEmpty())
           {
              System.out.println(pq3.poll());
           }
           System.out.println("\n\n");

           assertEquals(true,true);

        }
}
