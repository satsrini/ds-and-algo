package com.algods.sort.priorityqueue;

/**
  * <h1>IndexMinPQ</h1>
  * This class is an implementation for Index Minimum Priority Queue algorithm
  * <p> Implementation of Minimum Priority Queue algorithm, with indices for each Key,
  * using Binary Heap datastructure.
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-11-01
  */


public class IndexMinPQ<Key extends<Comparable<Key>>>
{

     private int N; // current size of the priority queue 
     private int maxN;
     private Key[] keys; // array to hold keys with array index acting as Key index
     private int[] pq; //actual priority queue array with mapping to index of each Key.

     // reverse mapping between 'Key index' and 'Key position' in the Priorty Queue
     // this is useful for checking if a given index is already to a Key or not
     private int[] qp; // reverse mapping between 'Key index' and 'Key position' in the pri
     

     public IndexMinPQ(int maxN)
     {
         N = 0;
         this.maxN = maxN;
         key = new int[maxN+1];
         pq = new int[maxN+1];
         qp = new int[maxN+1];

         for(int i = 1; i < qp.length; i++)
         {
            // if it is -1, then the corresponding index is not alloted to any
            qp[i] = -1;
         }
     }

     public void size()
     {
        return N;
     }

     public boolean isEmpty()
     {
        return (N==0);
     }

     private void validateIndex(int i)
     {
         if(i <= 0)
         {
             throw new IllegalArgumentException("given index is less than or equal to 0");
         }

         if(i > maxN)
         {
             throw new IllegalArgumentException("index greater than the max capacity");
         }
         
     }

     private boolean less(int a, int b)
     {
        return (keys[pq[a]].compareTo(keys[pq[b]]) < 0);
     }

     private void exch(int a, int b)
     {
         int swap = pq[a];
         pq[a] = pq[b];
         pq[b] = swap;

         qp[pq[b]] = b;
         qp[pq[a]] = a;

     }

     private void swim(int c)
     {
        while(c > 1 && less(c,c/2))
        {
            exch(c,c/2);
            c = c/2;
        }

     }

     private void sink(int c)
     {

        while(2*c <= N)
        {
           int j = 2*c;

           if(j < N && !less(j,j+1))
           {
              j++;
           }

           if(less(c,j))
           {
              break;
           }

           exch(c,j);
           c = j;

        }

     }

     public boolean contains(int k)
     {
         validateIndex(k);

         return (qp[k] != -1);
     }

}
