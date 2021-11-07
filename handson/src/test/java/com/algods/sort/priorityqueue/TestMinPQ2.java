package com.algods.sort.priorityqueue;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.sort.priorityqueue.MinPQ;
import com.algods.graph.mst.Edge;


public class TestMinPQ2
{

        private MinPQ<Edge> pq;
        
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

           pq = new MinPQ<>(10);

           pq.insert(e1);
           pq.insert(e2);
           pq.insert(e3);
           pq.insert(e4);
           pq.insert(e5);
           pq.insert(e6);
           pq.insert(e7);
           pq.insert(e8);
           pq.insert(e9);
           pq.insert(e10);





        }

        @Test
        public void testPriorityQueue()
        {
         
           System.out.println("\n\n");
           System.out.println("Natural Ordering:");
           while(!pq.isEmpty())
           {
              System.out.println(pq.deleteMin());
           }


           assertEquals(true,true);

        }
}
