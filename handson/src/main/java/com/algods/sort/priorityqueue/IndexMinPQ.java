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
        return (keys[a].compareTo(keys[b]) < 0);
     }

     private void exch(int a, int b)
     {
         int swap = pq[a];
         pq[a] = pq[b];
         pq[b] = swap;

         qp[pq[b]] = b;
         qp[pq[a]] = a;

     }

}
