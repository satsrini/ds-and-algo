package com.algods.search.binarysearch;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.search.binarysearch.BST;

public class TestBST
{

        private BST<Integer, String> bst;
	

	@Before
	public void setUp()
        {
           bst = new BST<>(); 
        }

        @Test
        public void testSize()
        {
           bst.put(50, "fifty");
           bst.put(25, "twenty five");
           bst.put(75, "seventy five");
           bst.put(10, "ten");
           bst.put(40, "forty");
           bst.put(60, "sixty");
           bst.put(90, "ninety");
           bst.put(5, "five");
           bst.put(15, "fifteen");
           bst.put(30, "thirty");
           bst.put(45, "forty five");
           bst.put(55, "fifty five");
           bst.put(70, "seventy");
           bst.put(85, "eighty five");
           bst.put(100, "one hundred");

           assertEquals(Integer.valueOf(15), Integer.valueOf(bst.size()));
        }

        @Test
        public void testGet()
        {

           bst.put(50, "fifty");
           bst.put(25, "twenty five");
           bst.put(75, "seventy five");
           bst.put(10, "ten");
           bst.put(40, "forty");
           bst.put(60, "sixty");
           bst.put(90, "ninety");
           bst.put(5, "five");
           bst.put(15, "fifteen");
           bst.put(30, "thirty");
           bst.put(45, "forty five");
           bst.put(55, "fifty five");
           bst.put(70, "seventy");
           bst.put(85, "eighty five");
           bst.put(100, "one hundred");

           assertEquals(bst.get(45), "forty five");

        }

        @Test
        public void testPut()
        {

           bst.put(50, "fifty");
           bst.put(25, "twenty five");
           bst.put(75, "seventy five");
           bst.put(10, "ten");
           bst.put(40, "forty");
           bst.put(60, "sixty");
           bst.put(90, "ninety");
           bst.put(5, "five");
           bst.put(15, "fifteen");
           bst.put(30, "thirty");
           bst.put(45, "forty five");
           bst.put(55, "fifty five");
           bst.put(70, "seventy");
           bst.put(85, "eighty five");
           bst.put(100, "one hundred");

           assertEquals(bst.get(90), "ninety");
         
           bst.put(90,"new-ninety");
           assertEquals(bst.get(90), "new-ninety");

           assertEquals(Integer.valueOf(15), Integer.valueOf(bst.size()));

        }


}

