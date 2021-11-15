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

   private int R;
   private int[] count;

   public KeyIndexedCounting(StringBean[] a, int R)
   {
      this.R = R;
      count = new int[R+1];

      this.sort(a);
   }

   private void sort(StringBean[] a)
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

}
