package com.algods.sort.priorityqueue;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.PriorityQueue;


public class TestJDKPriorityQueue
{

        private PriorityQueue<String> pq;
        private PriorityQueue<String> pq2;
        
	@Before
	public void setUp()
	{
           pq = new PriorityQueue<>(10);

           pq.add("cat");
           pq.add("dog");
           pq.add("zebra");
           pq.add("apple");

           pq2 = new PriorityQueue<>(10,(s1,s2) -> s2.compareTo(s1));// Comparator to set the priority as descending order of String elements.

           pq2.add("Chennai");
           pq2.add("Mumbai");
           pq2.add("Delhi");
           pq2.add("Kolkatta");

        }

        @Test
        public void testPriorityQueue()
        {
            System.out.println("\n\n");

            for(String str:pq)
            {
                System.out.println(str);
            }            


            assertEquals(Integer.valueOf(4), Integer.valueOf(pq.size()));
            assertEquals("apple", pq.poll());
            assertEquals(Integer.valueOf(3), Integer.valueOf(pq.size()));
            assertEquals("cat", pq.poll());
            assertEquals(Integer.valueOf(2), Integer.valueOf(pq.size()));
            System.out.println("\n\n");

            pq.add("ape");
            assertEquals(Integer.valueOf(3), Integer.valueOf(pq.size()));
            assertEquals("ape", pq.poll());
            assertEquals(Integer.valueOf(2), Integer.valueOf(pq.size()));
        }

        @Test
        public void testProrityQueue2()
        {
           assertEquals("Mumbai", pq2.poll());
           assertEquals("Kolkatta", pq2.poll());
           assertEquals(Integer.valueOf(2), Integer.valueOf(pq2.size()));
        }

        @Test
        public void testProrityQueue3()
        {

            System.out.println("\n\n");
            for(String s:pq)
            {
               System.out.println(s);
            }
            System.out.println("\n\n");
            for(String s:pq2)
            {
               System.out.println(s);
            }
            System.out.println("\n\n");

            while(!pq.isEmpty())
            {
               System.out.println(pq.poll());
            }

            System.out.println("\n\n");
            while(!pq2.isEmpty())
            {
               System.out.println(pq2.poll());
            }


            assertEquals(true,true);
        }



}
