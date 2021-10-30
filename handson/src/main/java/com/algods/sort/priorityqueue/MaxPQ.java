package com.algods.sort.priorityqueue;


/**
  * <h1>MaxPQ</h1>
  * This class is an implementation for Maximum Priority Queue algorithm
  * <p> Implementation of Maximum Priority Queue algorithm using 
  *     Binary Heap datastructure.
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-29
  */


public class MaxPQ<Key extends Comparable<Key>>
{

   private int N;
   private Key[] pq;

   public MaxPQ(int maxN)
   {
      N = 0;
      pq = (Key[])new Comparable[maxN+1];
   }

   public MaxPQ(Key[] pq)
   {
     this.pq = pq;
     N = pq.length;
   }

   public void insert(Key key)
   {

      pq[++N] = key;
      swim(N);

   }

   public Key deleteMax()
   {

       Key max = pq[1];

       exch(N,1);
       pq[N] = null;
       N--;
       sink(1);

       return max;
   }

   public int size()
   {
       return N;
   }

   public boolean isEmpty()
   {
       return (N == 0);
   }

   private boolean less(int a, int b)
   {
      return (pq[a].compareTo(pq[b]) < 0);
   }

   private void exch(int a, int b)
   {
      Key temp = pq[a];
      pq[a] = pq[b];
      pq[b] = temp;
   }

   public void sink(int k)
   {

      while(2*k <= N)
      {
         int j = 2*k;

         if(j < N && less(j,j+1))
         {
             j++;
         }

         if(!less(k,j))
         {
            break;
         }
        
         exch(k,j);
         k = j;

      }

   }

   public void swim(int k)
   {
      while(k > 1 && less(k/2,k))
      {
         exch(k,k/2);
         k = k/2;
      }
   }
   
}
