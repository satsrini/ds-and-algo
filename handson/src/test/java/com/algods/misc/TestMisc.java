package com.algods.misc;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class TestMisc
{



	@Before
	public void setUp()
	{
        }

        @Test
        public void testDoubleInfinite()
        {
           double d1 = Double.POSITIVE_INFINITY;
           double d2 = Double.POSITIVE_INFINITY;

           double d3 = Double.NEGATIVE_INFINITY;
           double e1 = 0.35;

           System.out.println(d1);
           System.out.println(d2);
           System.out.println(e1);
           

           System.out.println(d1 < (d2 + e1));
           System.out.println(d1 > (d2 + e1));
           System.out.println(d1==d2);
           System.out.println("d1 > d3 " + (d1 > d3));
           System.out.println("d1 < d3 " + (d1 < d3));
           System.out.println("d3 < d1 " + (d3 < d1));

           assertFalse(d1 < (d2 + e1));
           assertFalse(d1 > (d2 + e1));
           assertTrue(d1==d2);
           assertTrue(e1 < d1);
           assertTrue(d2 > e1);
        }

}
