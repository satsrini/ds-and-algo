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

   private Node root;

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

      Node x = get(root, key, 0);

      if(x == null)
      {
         return null;
      }

      return x.val;
   }

   private Node get(Node x, String key, int d)
   {

      if(x == null)
      {
         return null;
      }

      char c = key.charAt(d);

      if(c < x.c)
      {
        x = get(x.left,key,d); // go left
      }else
      if(c > x.c)    // go right
      {
        x = get(x.right,key,d);
      }else   // match for the character at position 'd' in the given 'key'
      if(d < key.length() -1) // go down next level.
      {
        x = get(x.mid, key, d+1);
      }
      
      return x;
      
   }

   public void put(String key, Value val)
   {
      root = put(root, key, val, 0);
   }

   private Node put(Node x, String key, Value val, int d)
   {

      char c = key.charAt(d);

      if(x == null)
      {
         x = new Node();
         x.c = c;
      }          

      if(c < x.c) // go left
      {
         x.left = put(x.left, key, val, d);
      }else
      if(c > x.c) // go right
      {
         x.right = put(x.right, key, val, d);
      }else
      if(d < key.length()-1)
      {
         x.mid = put(x.mid, key, val, d+1);
      }
      
      x.val = val;

      return x;

   }

}
