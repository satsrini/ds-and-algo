package com.algods.strings.sort;


/**
  * <h1>LSD</h1>
  * This class is an implementation for Least Significant Digits(LSD) algorithm for strings
  * <p> Implementation for LSD algorithm for Strings in Java.
  *     It uses key Indexed Counting technique to sort given list of Strings with equal
  *     length. Or to sort based on leading no of characters say W no of characters.
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-11-16
  */


public class LSD
{

    public LSD(){}

    public void sort(String[] a, int W)
    {

      int R = 256;
      String[] aux = new String[a.length];

      for(int d = W-1; d >= 0; d--)
      {

          int[] count = new int[R+1];

          for(int k = 0; k < a.length;k++)
          {
               count[a[k].charAt(d)+1]++;
          }

          for(int k = 0; k < R; k++)
          {
               count[k+1] += count[k];
          }

          for(int k = 0; k < a.length; k++)
          {
               aux[count[a[k].charAt(d)]++] = a[k];              
          }

          for(int k = 0; k < a.length; k++)
          {
               a[k] = aux[k];
          }
      }
    }

}
