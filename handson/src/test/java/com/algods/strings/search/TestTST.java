package com.algods.strings.search;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.strings.search.TST;

public class TestTST
{
        private TST<Integer> tst;
        private TST<Integer> tst2;


	@Before
	public void setUp()
        {
           tst2 = getTST2();
        }

        @Test
        public void testTrieSTPutAndGet()
        {
            tst = new TST<>();

            tst.put("she",0);
            tst.put("sells",1);
            tst.put("sea",2);
            tst.put("shells",3);
            tst.put("by",4);
            tst.put("the",5);
            tst.put("sea",6);
            tst.put("shore",7);

            assertEquals(Integer.valueOf(0),tst.get("she"));
            assertEquals(Integer.valueOf(1),tst.get("sells"));
            assertEquals(Integer.valueOf(6),tst.get("sea"));
            assertEquals(Integer.valueOf(3),tst.get("shells"));
            assertEquals(Integer.valueOf(4),tst.get("by"));
            assertEquals(Integer.valueOf(5),tst.get("the"));
            assertEquals(Integer.valueOf(6),tst.get("sea"));
            assertEquals(Integer.valueOf(7),tst.get("shore"));
           

        }

        @Test
        public void testTrieSTPutAndGet2()
        {
            assertEquals(Integer.valueOf(4), tst2.get("by"));
            assertEquals(Integer.valueOf(10), tst2.get("she"));
            assertEquals(Integer.valueOf(14), tst2.get("sea"));
            assertEquals(Integer.valueOf(15), tst2.get("shells"));
            assertEquals(Integer.valueOf(11), tst2.get("sells"));
            assertEquals(Integer.valueOf(7), tst2.get("shore"));
            assertEquals(Integer.valueOf(0), tst2.get("sur"));
            assertEquals(Integer.valueOf(13), tst2.get("surely"));
            assertEquals(Integer.valueOf(12), tst2.get("are"));
            assertEquals(Integer.valueOf(8), tst2.get("the"));
           
        }

        private TST<Integer> getTST2()
        {

            tst2 = new TST<>();

            tst2.put("she",10);
            tst2.put("by",4);
            tst2.put("are",12);
            tst2.put("the",8);
            tst2.put("shells",15);
            tst2.put("sells",11);
            tst2.put("sea",14);
            tst2.put("shore",7);
            tst2.put("surely",13);
            tst2.put("sur",0);

            return tst2;
            
        }

}
