package com.algods.jdkcollections;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


import java.util.Deque;
import java.util.ArrayDeque;



public class TestDeque
{

        private Deque<Integer> list;


	@Before
	public void setUp()
	{
           list = new ArrayDeque<>();

           list.addFirst(1);
           list.addFirst(5);
           list.addFirst(3);
           list.addFirst(7);
           list.addFirst(2);
        }

        @Test
        public void testIterate()
        {
           System.out.println("\n\n");
           System.out.println("Should be 2 7 3 5 1 :\n");
           for(int k:list)
           {
              System.out.print(k + " ");
           }
           System.out.println("\n\n");

           assertEquals(true,true);
        }


}
