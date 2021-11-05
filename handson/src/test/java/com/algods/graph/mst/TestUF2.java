package com.algods.graph.mst;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.mst.UF2;

public class TestUF2
{

        private UF2 uf;
	

	@Before
	public void setUp()
	{
           uf = new UF2(10);

	}

        @Test
        public void testUF()
        {

           assertEquals(Integer.valueOf(10),Integer.valueOf(uf.count()));

           assertEquals(Integer.valueOf(2),Integer.valueOf(uf.find(2)));

           //assertFalse(uf.connected(2,3));

           //uf.union(2,3);

           //assertTrue(uf.connected(2,3));

           //assertEquals(Integer.valueOf(9),Integer.valueOf(uf.count()));
           //assertEquals(Integer.valueOf(3),Integer.valueOf(uf.find(2)));

        }

        @Test
        public void testUF22()
        {

           uf.union(4,3);
           uf.union(3,8);
           uf.union(6,5);
           uf.union(9,4);
           uf.union(2,1);
           uf.union(5,0);
           uf.union(7,2);
           uf.union(6,1);

           assertEquals(Integer.valueOf(2),Integer.valueOf(uf.count()));
        }

        @Test
        public void testChainConnected()
        {
          assertFalse(uf.connected(2,6));
          assertFalse(uf.connected(6,8));
          assertFalse(uf.connected(2,8));
          uf.union(2,6);
          assertTrue(uf.connected(2,6));
          assertFalse(uf.connected(6,8));
          assertFalse(uf.connected(2,8));
          uf.union(6,4);
          assertTrue(uf.connected(2,6));
          assertFalse(uf.connected(6,8));
          assertFalse(uf.connected(2,8));
          uf.union(4,8);
          assertTrue(uf.connected(2,6));
          assertTrue(uf.connected(6,8));
          assertTrue(uf.connected(2,8));
        }

}

