package com.algods.strings.search;


/**
  * <h1>TST</h1>
  * This class is an implementation for TST(Ternary Search Tries) Data Structure
  * <p> Implementation for TST(Ternary Search Tries) data Strcuture in java.
  *     This is an alternative to TrieST where it takes of space problem.
  *     In TrieST space is proportional to R(number of character set eg 256 for ACSII).
  *     But for TST, space needed is only three(left,right and middle) for each character/node for the key.
  *     TST is useful where there are long keys as well as non random keys.
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-11-27
  */


public class TST<Value>
{
   private class Node
   {
      private char c;
      private Node left;
      private Node right;
      private Node mid;
      private Value val;
   }

   public TST()
   {

   }

   public Value get(String key)
   {
      return null;
   }



   public void put(String key, Value val)
   {

   }

}
