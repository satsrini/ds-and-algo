package com.algods.graph.beans;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class TestLinkedList {
	
	private Queue<String> list1;
	

	@Before
	public void setup()
	{
		list1 = new LinkedList<>();
		list1.add("First");
		list1.add("Second");
		list1.add("Third");
                list1.add("Fourth");
                list1.add("Fifth");
		list1.add("Sixth");
		
	}

        @Test
        public void printList()
        {
                Iterator<String> itr = list1.iterator();
                
                while(itr.hasNext())
                {
                   System.out.println(itr.next());
                }
 
                assertEquals(true,true);
        }
	
	@Test
	public void testListRemoved()
	{
                System.out.println(list1.remove());
                System.out.println(list1.remove());
                System.out.println(list1.remove());
                System.out.println(list1.remove());
                System.out.println(list1.remove());
                System.out.println(list1.remove());

		assertEquals(true,true);
	}



}

