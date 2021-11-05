package com.algods.graph.mst;

/**
  * <h1>UF</h1>
  * This class is an implementation for Union Find(UF) Data Structure
  * <p> Implementation for Union Find(UF) Data Structure in Java to be used in
  * Kruskal's Minimum Spanning Tree algorithm.
  * UnionFind Datastructure is used to segregate elements into various Components.
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-11-05
  */


public class UF
{

   private int[] id;
   private int count;

   public UF(int N)
   {
     count = N;
     
     id = new int[N];

     for(int i = 0; i < N; i++)
     {
        id[i] = i;
     }

   }

   public int count()
   {
     return count;
   }

   public boolean connected(int p, int q)
   {
     return find(p) == find(q);
   }

   public int find(int p)
   {
      return id[p];
   }

   public void union(int p, int q)
   {
       int proot = find(p);
       int qroot = find(q);

       if(proot == qroot)
       {
          return;
       }

       for(int i=0; i < id.length; i++)
       {
          if(id[i] == proot)
          {
             id[i] = qroot;
          }
       }

       count--;

   }

}
