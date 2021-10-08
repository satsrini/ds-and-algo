package com.algods.graph.beans;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestArrayList {
	
	private List<String> list1;
	private List<String> list2;
	

	@Before
	public void setup()
	{
		list1 = new ArrayList<>();
		list1.add("First");
		list1.add("Second");
		list1.add("Third");
		
		list2 = new ArrayList<>();
		list2.add("First");
		list2.add("Second");
		list2.add("Third");
		
	}
	
	@Test
	public void testListEquals()
	{
		assertTrue(list1.equals(list2));
	}

}

