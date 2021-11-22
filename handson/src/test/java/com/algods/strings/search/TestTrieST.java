package com.algods.strings.search;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.strings.search.TrieST;

public class TestTrieST
{
        private TrieST<Integer> trieST;

	@Before
	public void setUp()
        {

        }

        @Test
        public void testTrieSTPutAndGet()
        {
            trieST = new TrieST<>();

            trieST.put("she",0);
            trieST.put("sells",1);
            trieST.put("sea",2);
            trieST.put("shells",3);
            trieST.put("by",4);
            trieST.put("the",5);
            trieST.put("sea",6);
            trieST.put("shore",7);

            assertEquals(Integer.valueOf(0),trieST.get("she"));
            assertEquals(Integer.valueOf(1),trieST.get("sells"));
            assertEquals(Integer.valueOf(6),trieST.get("sea"));
            assertEquals(Integer.valueOf(3),trieST.get("shells"));
            assertEquals(Integer.valueOf(4),trieST.get("by"));
            assertEquals(Integer.valueOf(5),trieST.get("the"));
            assertEquals(Integer.valueOf(6),trieST.get("sea"));
            assertEquals(Integer.valueOf(7),trieST.get("shore"));
           

        }
}
