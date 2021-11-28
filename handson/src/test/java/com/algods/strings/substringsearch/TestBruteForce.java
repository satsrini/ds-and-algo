package com.algods.strings.substringsearch;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.strings.substringsearch.BruteForce;

public class TestBruteForce
{


	@Before
	public void setUp()
        {
        }

        @Test
        public void testBruteForce()
        {
           String text = "Searching for a needle in a haystack";
           String pattern = "needle";
           
           int result = new BruteForce().search(text,pattern);
           assertEquals(Integer.valueOf(16), Integer.valueOf(result));

           String pattern2 = "needles";

           int result2 = new BruteForce().search(text,pattern2);
           assertEquals(Integer.valueOf(-1), Integer.valueOf(result2));


        }


}
