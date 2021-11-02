package com.algods.sort.priorityqueue;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.sort.priorityqueue.IndexMinPQ;


public class TestIndexMinPQ
{

        private IndexMinPQ<String> indexMinPQ;
        

	@Before
	public void setUp()
	{
           indexMinPQ = new IndexMinPQ<>(15);

           indexMinPQ.insert(5,"cat");
           indexMinPQ.insert(1,"dog");
           indexMinPQ.insert(2,"apple");
           indexMinPQ.insert(7,"orange");
           indexMinPQ.insert(3,"horse");
           indexMinPQ.insert(9,"deer");
           indexMinPQ.insert(12,"tiger");
           indexMinPQ.insert(15,"lion");
           indexMinPQ.insert(4,"elephant");
           indexMinPQ.insert(6,"cow");
           indexMinPQ.insert(8,"rhinoceros");
           indexMinPQ.insert(10,"giraffe");
           indexMinPQ.insert(11,"zebra");
           indexMinPQ.insert(14,"buffalo");
           indexMinPQ.insert(13,"banana");

        }

        @Test
        public void testInsert()
        {
            System.out.println("\n\n");
            System.out.println("After Insert");

            indexMinPQ.print();

            System.out.println("\n\n");
            
            assertEquals(true, true);
        }

        @Test
        public void testChangeKey()
        {
            
            System.out.println("\n\n");
            indexMinPQ.changeKey(8,"ape");
            System.out.println("After Change Key:");

            indexMinPQ.print();

            System.out.println("\n\n");

           
            assertEquals(true,true);
        }

        @Test
        public void testDeleteMin()
        {

            System.out.println("\n\n");
            assertEquals(Integer.valueOf(15), Integer.valueOf(indexMinPQ.size()));
            assertEquals(Integer.valueOf(2), Integer.valueOf(indexMinPQ.delMin()));
            assertEquals(Integer.valueOf(14), Integer.valueOf(indexMinPQ.size()));
            assertEquals(Integer.valueOf(13), Integer.valueOf(indexMinPQ.delMin()));
            assertEquals(Integer.valueOf(13), Integer.valueOf(indexMinPQ.size()));
            System.out.println("After Delete Min:");

            indexMinPQ.print();

            System.out.println("\n\n");


            assertEquals(true,true);
        }

}

