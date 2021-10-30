package com.algods.sort.priorityqueue;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.ArrayList;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Iterator;

import com.algods.sort.priorityqueue.MaxPQ;


public class TestBottomM
{

        private List<Integer> list;

        private static final int M = 10;

	@Before
	public void setUp()
	{
           list = getInput();
        }

        @Test
        public void testBottomM()
        {

            MaxPQ<Integer> maxPQ = new MaxPQ<>(24);

            for(int k:list)
            {
               maxPQ.insert(k);
               if(maxPQ.size() > M)
               {
                  maxPQ.deleteMax();
               }
            }

            assertEquals(Integer.valueOf(M),Integer.valueOf(maxPQ.size()));

            Deque<Integer> stack = new ArrayDeque<>();

            while(maxPQ.size() > 0)
            {
               stack.add(maxPQ.deleteMax());    
            }

            assertEquals(Integer.valueOf(M),Integer.valueOf(stack.size()));

            System.out.println("\n\n");
            System.out.println("\n\n");

            Iterator<Integer> iterator = stack.descendingIterator(); 
            
            System.out.println("Printing Bottom M");
            System.out.println();

            while(iterator.hasNext())
            {
               System.out.print(iterator.next().intValue() + " ");
            }

            System.out.println("\n\n");
            System.out.println("\n\n");


            assertEquals(true,true);

        }


        private List<Integer> getInput()
        {
            List<Integer> list = new ArrayList<>();

            list.add(51);
            list.add(42);
            list.add(54);
            list.add(151);
            list.add(1);
            list.add(5);
            list.add(3);
            list.add(41);
            list.add(21);
            list.add(52);
            list.add(55);
            list.add(44);
            list.add(98);
            list.add(4);
            list.add(-1);
            list.add(-4);
            list.add(88);
            list.add(22);
            list.add(11);
            list.add(45);
            list.add(15);
            list.add(17);
            list.add(19);
            list.add(78);

            return list;

        }

}
