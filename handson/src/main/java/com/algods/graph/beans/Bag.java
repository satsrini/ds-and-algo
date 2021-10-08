package com.algods.graph.beans;


import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

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

public class Bag<Item> implements Iterable<Item>
{

   private Node first;
   private int N;

   public void add(Item item)
   {
      Node newNode = new Node(item);
      newNode.next = first;
      first = newNode;
      N++;
   }
   
   public int size() 
   {
	  return N;
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
   
   public boolean contains(Item item)
   {
	   Node currentNode = first;
	   
	   while(currentNode != null)
	   {
		   if(currentNode.item.equals(item)) 
		   {
			   return true;
		   }
		   currentNode = currentNode.next;
	   }
	   
	   return false;
   }

   public Iterator<Item> iterator()
   {
      return new BagIterator();
   }

   private class BagIterator implements Iterator<Item>
   {

      private Node currentNode;
      private int currentSize = 0;

      public BagIterator()
      {
         currentNode = first;
         this.currentSize = size();
      }

      public boolean hasNext()
      {
    	 conModCheck();
         return (currentNode != null);
      }

      public Item next()
      {
    	 
    	 conModCheck();
    	 
    	 if(currentNode == null)
    	 {
    		 throw new NoSuchElementException();
    	 }

    	 Item nextItem = currentNode.item;
         currentNode = currentNode.next;

         return nextItem;
      }
      
      private void conModCheck() 
      {
	  	 if(currentSize != size()) {
			 throw new ConcurrentModificationException();
	 	 }	   
      }      

   }
   

 
}

