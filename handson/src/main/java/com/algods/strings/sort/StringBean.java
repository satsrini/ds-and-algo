package com.algods.strings.sort;

/**
  * <h1>StringBean</h1>
  * This class is an implementation for StringBean Bean.
  * <p> Implementation for StringBean Bean
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-11-15
  */



public class StringBean
{
      private String name;

      private int key;

      public StringBean(String name, int key)
      {
         this.name = name;
         this.key = key;
      }


      public String name()
      {
         return name;
      }

      public int key()
      {
         return key;
      }

      @Override
      public String toString()
      {
         return String.format("Name = %s, Key = %d", name,key);
      }

}
