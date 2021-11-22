package com.algods.strings.search;

/**
  * <h1>TrieST</h1>
  * This class is an implementation for TrieST Data Structure
  * <p> Implementation for TrieST data Strcuture in java.
  *     This symbol table has Key as Strings and it is used to search String Keys including wild card searches.
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

       if(d == key.length())
       {
           return x;
       }   

       return get(key, x.getNode(key.charAt(d)), d+1);

    }

    public void put(String key, Value value)
    {
        put(key, value, root, 0);
    }

    private void put(String key, Value value,TrieNode<Value> x, int d)
    {
        if(x == null)
        {
            x = new TrieNode<>(R);
        }

        if(d == key.length())
        {
           x.setValue(value);
           return;
        }

        put(key, value, x.getNode(key.charAt(d)), d+1);
    }

}
