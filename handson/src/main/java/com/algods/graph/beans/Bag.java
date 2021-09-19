package com.algods.graph.beans;

public class Bag<Item>
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
 
}
