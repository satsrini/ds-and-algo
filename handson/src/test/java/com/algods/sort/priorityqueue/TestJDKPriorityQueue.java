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
        

	@Before
	public void setUp()
	{
           pq = new PriorityQueue<>(10);

           pq.add("cat");
           pq.add("dog");
           pq.add("zebra");
           pq.add("apple");

        }

        @Test
        public void testPriorityQueue()
        {
            System.out.println("\n\n");

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


}
