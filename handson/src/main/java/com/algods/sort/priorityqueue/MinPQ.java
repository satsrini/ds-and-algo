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
       N = pq.length;
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

    public void swim(int k)
    {
       while(k > 1 && less(k,k/2))
       {
          exch(k,k/2);
          k = k/2;
       }
    }

    public void sink(int k)
    {
       while(2*k <= N)
       {
         int j = 2*k;

         if(j < N && !less(j,j+1))
         {
           j++;
         }

         if(less(k,j))
         {
            break;
         }

         exch(k,j);
         k = j;

       }

    }

    public void insert(Key key)
    {
       pq[++N] = key;
       swim(N);
    }

    public Key deleteMin()
    {
       Key min = pq[1];
       exch(1,N);
       pq[N] = null;
       N--;
       sink(1);

       return min;
    }

    public void print()
    {
       for(int i = 1; i < pq.length; i++)
       {
           System.out.print(pq[i] + " ");
       }
    }

}
