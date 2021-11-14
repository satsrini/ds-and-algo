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

   public KeyIndexedCounting(StringBean[] a, int R)
   {
      this.a = a;
      this.R = R;
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
