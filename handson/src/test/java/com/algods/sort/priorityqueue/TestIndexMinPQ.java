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

           indexMinPQ.insert(4,"cat");
           indexMinPQ.insert(0,"dog");
           indexMinPQ.insert(1,"apple");
           indexMinPQ.insert(6,"orange");
           indexMinPQ.insert(2,"horse");
           indexMinPQ.insert(8,"deer");
           indexMinPQ.insert(11,"tiger");
           indexMinPQ.insert(14,"lion");
           indexMinPQ.insert(3,"elephant");
           indexMinPQ.insert(5,"cow");
           indexMinPQ.insert(7,"rhinoceros");
           indexMinPQ.insert(9,"giraffe");
           indexMinPQ.insert(10,"zebra");
           indexMinPQ.insert(13,"buffalo");
           indexMinPQ.insert(12,"banana");

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
            assertEquals(Integer.valueOf(1), Integer.valueOf(indexMinPQ.delMin()));
            assertEquals(Integer.valueOf(14), Integer.valueOf(indexMinPQ.size()));
            assertEquals(Integer.valueOf(12), Integer.valueOf(indexMinPQ.delMin()));
            assertEquals(Integer.valueOf(13), Integer.valueOf(indexMinPQ.size()));
            System.out.println("After Delete Min:");

            indexMinPQ.print();

            System.out.println("\n\n");


            assertEquals(true,true);
        }

        @Test
        public void testDeleteIndex()
        {

            System.out.println("\n\n");
            assertEquals(Integer.valueOf(15), Integer.valueOf(indexMinPQ.size()));
            indexMinPQ.delete(10);
            assertEquals(Integer.valueOf(14), Integer.valueOf(indexMinPQ.size()));

            System.out.println("After Delete Index:10");

            indexMinPQ.print();
            System.out.println("\n\n");


            indexMinPQ.delete(0);
            assertEquals(Integer.valueOf(13), Integer.valueOf(indexMinPQ.size()));
            System.out.println("After Delete Index:0");

            indexMinPQ.print();

            System.out.println("\n\n");


            assertEquals(true,true);
        }

        @Test
        public void testMinIndex()
        {

            System.out.println("Testing Min index");
            System.out.println("\n\n");
            assertEquals(Integer.valueOf(1), Integer.valueOf(indexMinPQ.minIndex()));
            indexMinPQ.delete(1);
            assertEquals(Integer.valueOf(12), Integer.valueOf(indexMinPQ.minIndex()));
            indexMinPQ.delMin();
            assertEquals(Integer.valueOf(13), Integer.valueOf(indexMinPQ.minIndex()));

        }

        @Test
        public void testHeapIterator()
        {

            System.out.println("\n\n");
            System.out.println("Iterator:");

            for(int k:indexMinPQ)
            {
               System.out.print(k + " ");
            }

            System.out.println("\n\n");

            assertEquals(true,true);
        }


}

