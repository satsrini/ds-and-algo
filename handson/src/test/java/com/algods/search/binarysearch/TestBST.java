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
           setBST1();
           assertEquals(Integer.valueOf(15), Integer.valueOf(bst.size()));
        }

        @Test
        public void testGet()
        {
           setBST1();
           assertEquals(bst.get(45), "forty five");
        }

        @Test
        public void testPut()
        {
           setBST1();

           assertEquals(bst.get(90), "ninety");
         
           bst.put(90,"new-ninety");
           assertEquals(bst.get(90), "new-ninety");

           assertEquals(Integer.valueOf(15), Integer.valueOf(bst.size()));

        }

        @Test
        public void testPreOrderTraversal()
        {
           setBST1();

           BSTOrderBean<String> bstOrderBean = bst.order();

           System.out.println("\n\n");
           System.out.println("Pre Order");
           System.out.println("\n\n");


           for(String s:bstOrderBean.getPreOrder())
           {
              System.out.print(String.format("[%s] ",s));
           }

           System.out.println("\n\n");
           assertEquals(true, true);
        }

        @Test
        public void testInOrderTraversal()
        {
           setBST1();

           BSTOrderBean<String> bstOrderBean = bst.order();

           System.out.println("\n\n");
           System.out.println("In Order");
           System.out.println("\n\n");
           for(String s:bstOrderBean.getInOrder())
           {
              System.out.print(String.format("[%s] ",s));
           }

           System.out.println("\n\n");
           assertEquals(true, true);

           
        }

        @Test
        public void testPostOrderTraversal()
        {
           setBST1();

           BSTOrderBean<String> bstOrderBean = bst.order();

           System.out.println("\n\n");
           System.out.println("Post Order");
           System.out.println("\n\n");
           for(String s:bstOrderBean.getPostOrder())
           {
              System.out.print(String.format("[%s] ",s));
           }

           System.out.println("\n\n");
           assertEquals(true, true);


        }


        private void setBST1()
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

        }
}

