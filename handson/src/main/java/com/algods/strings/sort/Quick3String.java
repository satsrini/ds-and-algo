package com.algods.strings.sort;


/**
  * <h1>Quick3String</h1>
  * This class is an implementation for Quick3String algorithm
  * <p> Implementation of Quick3String algorithm which sorts an array
  *     of Strings by recursively dividing the array and subarrays into
  *     3 parts. Three Way Sort is favored for String arrays with many duplicates or
  *     String arrays having some String elements with long prefix since
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

       if(lo >= hi)
       {
          return;
       }

       int lt = lo;
       int gt = hi;

       int v = -1;

       if(d < a[lo].length())
       {
          v = (int)a[lo].charAt(d);
       }
       int i = lo+1;

       while(i <= gt)
       {
         int t = -1;

         if(d < a[i].length())
         {
            t = (int)a[i].charAt(d);
         }

         if(t < v)
         {
             exch(a,lt++,i++);
         }else
         if(t > v)
         {
             exch(a,i,gt--);
         }else
         {
             i++;
         }

       }

       sort(a,lo,lt-1,d); // first part
       if(v > 0)
       {
          sort(a,lt,gt,d+1); // second part
       }
       sort(a,gt+1,hi,d); // third part


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

    public static void main(String[] args)
    {
       String h = "hello";

       char c = 'c';
       int a = c;

       System.out.println((int)h.charAt(0));
    }

}
