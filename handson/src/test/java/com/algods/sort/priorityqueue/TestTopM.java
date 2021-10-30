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

import com.algods.sort.priorityqueue.MinPQ;

public class TestTopM
{

   private static final int M = 10;
   private List<Integer> list;

   @Before
   public void setUp()
   {
     list = input();

   }

   @Test
   public void testTopM()
   {
      MinPQ<Integer> minPQ = new MinPQ<>(24);

      for(int k:list)
      {
        minPQ.insert(k);
        if(minPQ.size() > M)
        {
           minPQ.deleteMin();
        }
      }

      assertEquals(Integer.valueOf(M),Integer.valueOf(minPQ.size()));

      Deque<Integer> stack = new ArrayDeque<>();

      while(!minPQ.isEmpty())
      {
         stack.add(minPQ.deleteMin());
      }

      assertEquals(Integer.valueOf(M),Integer.valueOf(stack.size()));

      System.out.println("\n\n");
      System.out.println("Printing TopM");
      System.out.println();

      Iterator<Integer> iterator = stack.descendingIterator();

      while(iterator.hasNext())
      {
         System.out.print(iterator.next().intValue() + " ");
      }

      System.out.println("\n\n");

      assertEquals(true,true);

   }


   private List<Integer> input()
   {
      list = new ArrayList<>();

      list.add(1000);
      list.add(-1);
      list.add(20);
      list.add(45);
      list.add(55);
      list.add(-2);
      list.add(555);
      list.add(56);
      list.add(4);
      list.add(67);
      list.add(675);
      list.add(65);
      list.add(89);
      list.add(34);
      list.add(23);
      list.add(17);
      list.add(50);
      list.add(-5);
      list.add(222);
      list.add(111);
      list.add(345);
      list.add(85);
      list.add(578);
      list.add(1);    

      return list;
   }



}


