package com.algods.graph.mst;

/**
  * <h1>UF2</h1>
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

public class UF2
{

   private int count;
   private int[] id;

   public UF2(int N)
   {
      count = N;
      id = new int[N];

      for(int i = 0; i < id.length; i++)
      {
        id[i] = i;
      }

   }

   public int count()
   {
      return count;
   }

   public int find(int p)
   {
      while(id[p] != p)
      {
         p = id[p];
      }

      return p;
   }

   public boolean connected(int p, int q)
   {
      return find(p)==find(q); 
   }

   public void union(int p, int q)
   {
      int pRoot = find(p);
      int qRoot = find(q);

      if(pRoot == qRoot)
      {
         return;
      }

      id[pRoot] = qRoot;

      count--;

   }

}
