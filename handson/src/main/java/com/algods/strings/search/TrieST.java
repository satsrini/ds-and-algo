package com.algods.strings.search;


import java.util.Queue;
import java.util.LinkedList;

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
        root = put(key, value, root, 0);
    }

    private TrieNode<Value> put(String key, Value value,TrieNode<Value> x, int d)
    {

        if(x == null)
        {
           x = new TrieNode<>(R);
        }


        if(d == key.length())
        {
           x.setValue(value);
           return x;
        }
 
        char c = key.charAt(d);       
        x.setNode(c,put(key,value,x.getNode(c),d+1));
        
        return x;

    }

    public int size()
    {
        return size(root);
    }

    private int size(TrieNode x)
    {
       int count = 0;

       if(x == null)
       {
           return 0;
       }

       if(x.getValue() != null)
       {
          count++;
       }

       for(int i = 0; i < R; i++)
       {
         count += size(x.getNode(i));
       }

       return count;
    }

    public Iterable<String> keys()
    {
       return keysWithPrefix("");
    }

    public Iterable<String> keysWithPrefix(String pre)
    {

       Queue<String> queue = new LinkedList<>();

       TrieNode<Value> x = get(pre, root, 0);

       collect(x,pre,queue);
       return queue;
    }

    private void collect(TrieNode<Value> x, String pre, Queue queue)
    {
       if(x == null)
       {
          return;
       }

       if(x.getValue() != null)
       {
          queue.add(pre);
       }

       for(char c = 0; c < R; c++)
       {
          collect(x.getNode(c), pre+c, queue);
       }


    }

    public Iterable<String> keysThatMatch(String pat)
    {
       Queue<String> queue = new LinkedList<>();

       collect(root, "", pat, queue);

       return queue;

    }

    private void collect(TrieNode<Value> x, String pre, String pat, Queue queue)
    {
       if(x == null)
       {
          return;
       }

       int d = pre.length();

       if(d == pat.length() && x.getValue() != null)
       {
          queue.add(pre);
          return;
       }

       if(d == pat.length())
       {
          return;
       }

       char next = pat.charAt(d);

       for(char c = 0; c < R; c++)
       {
          if(next == '.' || next == c)
          {
             collect(x.getNode(c), pre+c, pat, queue);
          }
       }
    }
}
