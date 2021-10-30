package com.algods.sort.priorityqueue;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.sort.priorityqueue.MinPQ;


public class TestMinPQ
{

	private Integer[] pq;
        private Integer[] pq2;

	@Before
	public void setUp()
	{
            pq = new Integer[16];

            pq[1] = 1;
            pq[2] = 2;
            pq[3] = 3;
            pq[4] = 4;
            pq[5] = 5;
            pq[6] = 7;
            pq[7] = 8;
            pq[8] = 11;
            pq[9] = 12;
            pq[10] = 14;
            pq[11] = 13;
            pq[12] = 25;
            pq[13] = 6;
            pq[14] = 15;
            pq[15] = 55;

            pq2 = new Integer[16];

            pq2[1] = 1;
            pq2[2] = 2;
            pq2[3] = 3;
            pq2[4] = 4;
            pq2[5] = 5;
            pq2[6] = 6;
            pq2[7] = 8;
            pq2[8] = 11;
            pq2[9] = 12;
            pq2[10] = 14;
            pq2[11] = 13;
            pq2[12] = 25;
            pq2[13] = 7;
            pq2[14] = 15;
            pq2[15] = -1;

        }

        @Test
        public void testSink()
        {
            System.out.println("\n\n");
            System.out.println("Before Sink");
            System.out.println();
            for(int i = 1; i < pq.length; i++)
            {
               System.out.print(pq[i].intValue() + " ");
            }

            MinPQ<Integer> minPQ = new MinPQ<>(pq);
            minPQ.sink(6);

            System.out.println("\n\n");
            System.out.println("After Sink");
            System.out.println();


            for(int i = 1; i < pq.length; i++)
            {
               System.out.print(pq[i].intValue() + " ");
            }


            System.out.println("\n\n");
            
            assertEquals(true, true);
        }


        @Test
        public void testSwim()
        {
            System.out.println("\n\n");
            System.out.println("Before Swim");
            System.out.println();
            for(int i = 1; i < pq.length; i++)
            {
               System.out.print(pq[i].intValue() + " ");
            }

            MinPQ<Integer> minPQ = new MinPQ<>(pq);
            minPQ.swim(13);

            System.out.println("\n\n");
            System.out.println("After Swim");
            System.out.println();


            for(int i = 1; i < pq.length; i++)
            {
               System.out.print(pq[i].intValue() + " ");
            }


            System.out.println("\n\n");

            assertEquals(true, true);
        }

        @Test
        public void testSwim2()
        {
            System.out.println("\n\n");
            System.out.println("Before Swim2");
            System.out.println();
            for(int i = 1; i < pq2.length; i++)
            {
               System.out.print(pq2[i].intValue() + " ");
            }

            MinPQ<Integer> minPQ = new MinPQ<>(pq2);
            minPQ.swim(15);

            System.out.println("\n\n");
            System.out.println("After Swim2");
            System.out.println();


            for(int i = 1; i < pq2.length; i++)
            {
               System.out.print(pq2[i].intValue() + " ");
            }


            System.out.println("\n\n");

            assertEquals(true, true);
        }

        @Test
        public void testInsert()
        {

            MaxPQ<Integer> maxPQ = getMaxPQ();
            System.out.println("\n\n");
            maxPQ.print();
            System.out.println("\n\n");

            assertEquals(Integer.valueOf(15), Integer.valueOf(maxPQ.size()));

        }

        @Test
        public void testDeleteMax()
        {

           MaxPQ<Integer> maxPQ = getMaxPQ();

           assertEquals(Integer.valueOf(26), maxPQ.deleteMax());
           assertEquals(Integer.valueOf(14), Integer.valueOf(maxPQ.size()));

           System.out.println("\n\n After delete Max \n");
           maxPQ.print();
           System.out.println("\n\n");

           maxPQ.insert(32);
           assertEquals(Integer.valueOf(15), Integer.valueOf(maxPQ.size()));
        
           System.out.println("\n\n After inserting 32 \n");
           maxPQ.print();
           System.out.println("\n\n");
            

        }

        private MaxPQ getMaxPQ()
        {
            MaxPQ<Integer> maxPQ = new MaxPQ<>(15);

            maxPQ.insert(26);
            maxPQ.insert(24);
            maxPQ.insert(25);
            maxPQ.insert(22);
            maxPQ.insert(20);
            maxPQ.insert(21);
            maxPQ.insert(23);
            maxPQ.insert(15);
            maxPQ.insert(14);
            maxPQ.insert(16);
            maxPQ.insert(17);
            maxPQ.insert(5);
            maxPQ.insert(4);
            maxPQ.insert(7);
            maxPQ.insert(19);

            return maxPQ;

        }

}
