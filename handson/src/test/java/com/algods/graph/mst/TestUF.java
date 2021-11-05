package com.algods.graph.mst;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.mst.UF;

public class TestUF
{

        private UF uf;
	

	@Before
	public void setUp()
	{
           uf = new UF(10);

	}

        @Test
        public void testUF()
        {

           assertEquals(Integer.valueOf(10),Integer.valueOf(uf.count()));

           assertEquals(Integer.valueOf(2),Integer.valueOf(uf.find(2)));

           assertFalse(uf.connected(2,3));

           uf.union(2,3);

           assertTrue(uf.connected(2,3));

           assertEquals(Integer.valueOf(9),Integer.valueOf(uf.count()));
           assertEquals(Integer.valueOf(3),Integer.valueOf(uf.find(2)));

        }

}

