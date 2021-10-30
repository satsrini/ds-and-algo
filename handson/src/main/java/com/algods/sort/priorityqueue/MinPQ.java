package com.algods.sort.priorityqueue;



/**
  * <h1>MinPQ</h1>
  * This class is an implementation for Minimum Priority Queue algorithm
  * <p> Implementation of Minimum Priority Queue algorithm using
  *     Binary Heap datastructure.
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-30
  */


public class MinPQ<Key extends Comparable<Key>>
{

    private int N;
    private Key[] pq;

    public MinPQ(int max)
    {
       N = 0;
       pq = (Key[])new Comparable[max+1];
    }

    public MinPQ(Key[] pq)
    {
       N = 0;
       this.pq = pq;
    }

    public int size()
    {
       return N;
    }

    public boolean isEmpty()
    {
       return (N==0);
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

}
