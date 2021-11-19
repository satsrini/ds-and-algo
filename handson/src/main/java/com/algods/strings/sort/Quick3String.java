package com.algods.strings.sort;


/**
  * <h1>Quick3String</h1>
  * This class is an implementation for Quick3String algorithm
  * <p> Implementation of Quick3String algorithm which sorts an array
  *     of Strings by recursively dividing the array and subarrays into
  *     3 parts. Three Way Sort is favored for String arrays with many duplicates since
  *     duplicates are gathered in the middle part of the 3 parts.
  * 
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-11-19
  */


public class Quick3String
{

    private String[] a;

    public Quick3String(String[] a)
    {
       this.a = a;
    }

    public void sort()
    {
       sort(a, 0, a.length-1, 0);
    }


    private void sort(String[] a, int lo, int hi, int d)
    {


    }

    private void exch(String[] a, int p, int q)
    {
       String tmp = a[p];
       a[p] = a[q];
       a[q] = tmp;
    }

    private boolean less(String[] a, int p, int q)
    {

        if(a[q].compareTo(a[p]) < 0)
        {
           return false;
        }
         
        return true;
    }

    private int charAt(String a, char d)
    {
       if(d >= a.length())
       {
          return -1;
       }

       return a.charAt(d);
    }

}
