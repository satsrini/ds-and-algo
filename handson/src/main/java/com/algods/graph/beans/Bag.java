package com.algods.graph.beans;


/**
  * <h1>Bag</h1>
  * This class is an implementation for Bag Data Structure
  * <p> Implementation for Bag Data Structure in Java
  * 
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-09-20
  */

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item>
{

   private Node first;

   public void add(Item item)
   {
      Node newNode = new Node(item);
      newNode.next = first;
      first = newNode;
   }

   private class Node
   {
      private Item item;
      private Node next;

      public Node(Item item)
      {
         this.item = item;
      }
   }

   public Iterator<Item> iterator()
   {
      return new BagIterator();
   }

   private class BagIterator implements Iterator<Item>
   {

      private Node currentNode;

      public BagIterator()
      {
         currentNode = first;
      }

      public boolean hasNext()
      {
         return (currentNode != null);
      }

      public Item next()
      {
         Item nextItem = currentNode.item;
         currentNode = currentNode.next;
         return nextItem;
      }

   }
 
}
