package com.algods.graph.beans;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

import java.util.Deque;
import java.util.ArrayDeque;

/**
  * <h1>TestDeque</h1>
  * Test class for performing JUnit Test cases for Deque Data Structure
  * <p> Implementation for JUnit Test cases for Deque Data Structure in Java
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-15
  */

public class TestDeque
{

    private Deque<String> deque;

    @Before
    public void setUp()
    {
        deque = new ArrayDeque<>();
        
        deque.addFirst("First");
        deque.addFirst("Second");
        deque.addFirst("Third");
        deque.addFirst("Fourth");
        deque.addFirst("Fifth");
        deque.addFirst("Sixth");

        System.out.println("SETTING UP");
    }

    @Test
    public void testPrintDeque()
    {
        System.out.println("\n\n");

        for(String str:deque)
        {
           System.out.println(str);
        }

        System.out.println("\n\n");

        assertEquals(true,true);
    }

    @Test
    public void testPrintDequeAsStack()
    {

        Iterator<String> itr = deque.descendingIterator();

        while(itr.hasNext())
        {
           System.out.println(itr.next());
        }

        System.out.println("\n\n");

        assertEquals(true,true);
    }

    
}

