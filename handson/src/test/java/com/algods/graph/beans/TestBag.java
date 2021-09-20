package com.algods.graph.beans;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import org.junit.Before;
import com.algods.graph.beans.Bag;
import java.util.Iterator;


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


}


