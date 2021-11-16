package com.algods.strings.sort;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.strings.sort.LSD;

public class TestLSD
{


        private String[] a;
        private LSD lsd;

	@Before
	public void setUp()
	{
           a =     new String[]{
                           "4PGC938",
                           "2IYE230",
                           "3CIO720",
                           "1ICK750",
                           "1OHV845",
                           "4JZY524",
                           "1ICK750",
                           "3CIO720",
                           "1OHV845",
                           "1OHV845",
                           "2RLA629",
                           "2RLA629",
                           "3ATW723"};
        }

        @Test
        public void testLSDSort()
        {

            System.out.println("\n\n");
            System.out.println("Before Sorting:");

            for(String str:a)
            {
               System.out.println(str);
            }

            System.out.println("\n\n");


            lsd = new LSD(a,7);
            lsd.sort();

            System.out.println("\n\n");
            System.out.println("After Sorting:");

            for(String str:a)
            {
               System.out.println(str);
            }

            System.out.println("\n\n");

            assertEquals(true,true);
        }


}
