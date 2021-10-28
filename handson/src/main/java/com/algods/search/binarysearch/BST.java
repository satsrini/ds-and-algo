package com.algods.search.binarysearch;

/**
  * <h1>BST</h1>
  * This class is an implementation for Binary Search Tree algorithm
  * <p> Implementation for Binary Search Tree algorithm in Java to be used 
  * to find inorder, preorder and postorder traversals
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-27
  */

import java.util.Queue;
import java.util.LinkedList;


public class BST<Key extends Comparable<Key>, Value>
{

   private Node root;

   private Queue<Value> preOrder;
   private Queue<Value> inOrder;
   private Queue<Value> postOrder;

   public BST()
   {
      preOrder = new LinkedList<>();
      inOrder = new LinkedList<>();
      postOrder = new LinkedList<>();
   }

   public int size()
   {
      return size(root);
   }

   public int size(Node x)
   {
       if(x == null)
       {
          return 0;
       }

       return x.N;
   }

   public Value get(Key key)
   {
       return get(key, root);
   }

   private Value get(Key key, Node x)
   {
      if(x == null)
      {
        return null;
      }

      int cmp = key.compareTo(x.key);

      if(cmp < 0) // go left
      {
         return get(key, x.left);
      }else
      if(cmp > 0) // go right
      {
         return get(key, x.right);
      }else // match found
      {
         return x.value;
      }

   }

   public void put(Key key, Value value)
   {
      root = put(key, value, root);
   }

   private Node put(Key key, Value value, Node x)
   {
  
      if(x == null)
      {
          return new Node(key,value,1); // creating a new node
      }

      int cmp = key.compareTo(x.key);
     
      if(cmp < 0) // go left
      {
         x.left = put(key,value,x.left);
      }else
      if(cmp > 0) // go right
      {
         x.right = put(key,value,x.right);
      }else  // match found
      {
         x.value = value;
      }

      //recalculate size since a new node might have been added
      x.N = size(x.left) + size(x.right) + 1;

      return x;

   }

   public BSTOrderBean<Value> order()
   {

      //depthFirstPreOrder(root);
      //depthFirstInOrder(root);
      //depthFirstPostOrder(root);

      depthFirstOrder(root);

      return new BSTOrderBean(preOrder, inOrder, postOrder);
   }

   /** complete method that takes care of pre order, in order and
    *  post order traversal
    */
   private void depthFirstOrder(Node x)
   {
      if(x == null)
      {
         return;
      }

      preOrder.add(x.value);
      depthFirstOrder(x.left); // always go left
      inOrder.add(x.value);
      depthFirstOrder(x.right);
      postOrder.add(x.value);


   }

   private void depthFirstPreOrder(Node x)
   {
      if(x == null)
      {
         return;
      }

      preOrder.add(x.value);   

      depthFirstPreOrder(x.left); // always go left first

      depthFirstPreOrder(x.right);

   }

   private void depthFirstPostOrder(Node x)
   {
      if(x == null)
      {
         return;
      }

      depthFirstPostOrder(x.left);
      depthFirstPostOrder(x.right);
      postOrder.add(x.value);

   }

   private void depthFirstInOrder(Node x)
   {
      if(x == null)
      {
         return;
      }

      depthFirstInOrder(x.left);
      inOrder.add(x.value);
      depthFirstInOrder(x.right);

   }


   private class Node
   {
      private Key key;
      private Value value;
      private int N;

      private Node left;
      private Node right;

      private Node(Key key, Value value, int N)
      {
         this.key = key;
         this.value = value;
         this.N = N;
      }
   }

}
