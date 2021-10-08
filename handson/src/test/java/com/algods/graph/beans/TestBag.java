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


/**
  * <h1>Bag</h1>
  * Test class for performing JUnit Test cases for Bag Data Structure
  * <p> Implementation for JUnit Test cases Bag Data Structure in Java
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-09-20
  */

public class TestBag
{

    private Bag<String> bag;
    private Iterator<String> itr;

    @Before
    public void setUp()
    {
        bag = new Bag<>();
        
        bag.add("First");
        bag.add("Second");
        //bag.add("Third");
        //bag.add("Fourth");
        //bag.add("Fifth");
        //bag.add("Sixth");

        itr = bag.iterator();
        System.out.println("SETTING UP");
    }

    @Test
    public void testHasNext_BaseCase()
    {
        assertTrue(itr.hasNext());
    }

    @Test
    public void testHasNext_C1()
    {
        itr.next();
        itr.next();
        assertFalse(itr.hasNext());
    }

    @Test(expected = ConcurrentModificationException.class)
    public void testHasNext_C5()
    {
        bag.add("Elephant");
        itr.hasNext();
    }

    @Test
    public void testNext_BaseCase()
    {
        assertEquals("Second", itr.next());

    }
    
    @Test(expected = NoSuchElementException.class)
    public void testNext_C1()
    {
    	itr.next();
    	itr.next();
    	itr.next();
    }
    
    @Test
    public void testNext_C2()
    {
    	bag = new Bag<>();
    	bag.add(null);
    	itr = bag.iterator();
    	assertTrue(itr.hasNext());
    	assertNull(itr.next());
    }
    
    @Test(expected = ConcurrentModificationException.class)
    public void testNext_C5()
    {
    	bag.add("Elephant");
    	itr.next();
    }
    
    @Test
    public void testContains()
    {
    	assertTrue(bag.contains("First"));
    	assertFalse(bag.contains("Third"));
    }
    
}

