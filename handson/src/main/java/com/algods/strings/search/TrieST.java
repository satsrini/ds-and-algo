package com.algods.strings.search;

/**
  * <h1>TrieST</h1>
  * This class is an implementation for TrieST Data Structure
  * <p> Implementation for TrieST data Strcuture in java.
  *     This symbol table has Key as Strings and it is used to search String Keys including wild card seraches.
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-11-21
  */



public class TrieST<Value>
{

    private static int R = 256; // all ASCII characters

    private TrieNode<Value> root;

    public TrieST()
    {

    }

    public Value get(String key)
    {
       TrieNode<Value> node = get(key, root, 0);

       if(node == null)
       {
          return null;
       }

       return node.getValue();
    }

    private TrieNode<Value> get(String key, TrieNode<Value> x, int d)
    {
       if(x == null)
       {
           return x;
       }

       return null;

    }

    public void put(String key)
    {


    }

}