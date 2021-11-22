package com.algods.strings.search;

/**
  * <h1>TrieNode</h1>
  * This class is an implementation for TrieNode Data Structure
  * <p> Implementation for TrieNode data Strcuture in java.
  *     Used to hold the Key and Value for TrieST Data structure.
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-11-22
  */



public class TrieNode<Value>
{
    private Value value;
    private TrieNode[] children;

    public TrieNode(int R)
    {
       children = new TrieNode[R];
    }

    public Value getValue()
    {
       return value;
    }

    public void setValue(Value value)
    {
       this.value = value;
    }

    public TrieNode<Value> getNode(int r)
    {
       return children[r];
    }   

    public void setNode(int r, TrieNode<Value> node)
    {
       children[r] = node;
    }

}
