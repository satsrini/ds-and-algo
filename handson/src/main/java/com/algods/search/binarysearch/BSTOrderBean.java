package com.algods.search.binarysearch;


/**
  * <h1>BSTOrderBean</h1>
  * This class is a bean to hold preOrder, inOrder and postOrder traversals.
  * <p>  This class is a bean to hold preOrder, inOrder and postOrder traversals.
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-27
  */


public class BSTOrderBean<Value>
{

    private Iterable<Value> preOrder;
    private Iterable<Value> inOrder;
    private Iterable<Value> postOrder;

    public BSTOrderBean(Iterable<Value> preOrder,
                        Iterable<Value> inOrder,
                        Iterable<Value> postOrder)
    {
       this.preOrder = preOrder;
       this.inOrder = inOrder;
       this.postOrder = postOrder;
    }

    public Iterable<Value> getPreOrder()
    {
       return preOrder;
    }

    public Iterable<Value> getInOrder()
    {
       return inOrder;
    }

    public Iterable<Value> getPostOrder()
    {
       return postOrder;
    }

}
