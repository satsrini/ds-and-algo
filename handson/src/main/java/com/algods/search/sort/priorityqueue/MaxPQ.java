package com.algods.search.sort.priorityqueue;


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

   public void insert(Key key)
   {

   }

   public Key deleteMax()
   {
       return null;
   }

   public int size()
   {
       return N;
   }

   public boolean isEmpty()
   {
       return (N == 0);
   }
}
