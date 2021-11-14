package com.algods.strings.sort;


/**
  * <h1>KeyIndexedCounting</h1>
  * This class is an implementation for KeyIndexedCounting Algorithm.
  * <p> Implementation for KeyIndexedCounting Algorithm
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-11-14
  */


public class KeyIndexedCounting
{

   private StringBean[] a;
   private int R;
   private int[] count;

   public KeyIndexedCounting(StringBean[] a, int R)
   {
      this.a = a;
      this.R = R;
      count = new int[R+1];
   }

   private void sort()
   {
     for(int i = 0; i < a.length; i++)
     {
        count[a[i].key()+1]++;
     }

     for(int i = 0; i < R; i++)
     {
       count[i+1] += count[i];
     }

     StringBean[] aux = new StringBean[a.length];

     for(int i = 0; i < aux.length; i++)
     {
        aux[count[a[i].key()]++] = a[i];
     }

     for(int i = 0; i < a.length; i++)
     {
        a[i] = aux[i];
     }

   }

    

   private class StringBean
   {
      private String name;

      private int key;

      private StringBean(String name, int key)
      {
         this.name = name;
         this.key = key;
      }


      private String name()
      {
         return name;
      }

      private int key()
      {
         return key;
      }

   }

}
