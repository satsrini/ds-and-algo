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

import java.util.Stack;
import java.util.Iterator;


/**
  * <h1>TestStack</h1>
  * Test class for performing JUnit Test cases for Stack Data Structure
  * <p> Implementation for JUnit Test cases Stack Data Structure in Java
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-15
  */

public class TestStack
{

    private Stack<String> stack;

    @Before
    public void setUp()
    {
        stack = new Stack<>();
        
        stack.add("First");
        stack.add("Second");
        stack.add("Third");
        stack.add("Fourth");
        stack.add("Fifth");
        stack.add("Sixth");

        System.out.println("SETTING UP");
    }

    @Test
    public void testPrintStack()
    {

        for(String str:stack)
        {
           System.out.println(str);
        }

        assertEquals(true,true);
    }

    @Test
    public void testPrintStack2()
    {
        Iterator<String> itr = stack.iterator();

        System.out.println("Printing thru Iterator");

        while(itr.hasNext())
        {
           System.out.println(itr.next());
        }

        assertEquals(true,true);
    }
    
}

