package com.algods.search.binarysearch;

import java.util.Queue;

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

    private Queue<Value> preOrder;
    private Queue<Value> inOrder;
    private Queue<Value> postOrder;

    public BSTOrderBean(Queue<Value> preOrder,
                        Queue<Value> inOrder,
                        Queue<Value> postOrder)
    {

    }

}
