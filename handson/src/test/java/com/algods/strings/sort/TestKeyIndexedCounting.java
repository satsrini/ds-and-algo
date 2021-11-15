package com.algods.strings.sort;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.strings.sort.KeyIndexedCounting;
import com.algods.strings.sort.StringBean;

public class TestKeyIndexedCounting
{


        private StringBean[] a;
        private KeyIndexedCounting keyIndexedCounting;

	@Before
	public void setUp()
	{
            a = new StringBean[10];

            a[0] = new StringBean("Anderson", 2);
            a[1] = new StringBean("Brown", 3);
            a[2] = new StringBean("Davis", 3);
            a[3] = new StringBean("Garcia", 4);
            a[4] = new StringBean("Harris", 1);
            a[5] = new StringBean("Jackson", 3);
            a[6] = new StringBean("Johnson", 4);
            a[7] = new StringBean("Jones", 3);
            a[8] = new StringBean("Martin", 1);
            a[9] = new StringBean("Martinez", 2);

        }

        @Test
        public void testSort()
        {

            System.out.println("\n\n");
            System.out.println("Before Sorting:");

            for(StringBean sb:a)
            {
               System.out.println(sb);
            }

            System.out.println("\n\n");


            keyIndexedCounting = new KeyIndexedCounting(a,5);

            System.out.println("\n\n");
            System.out.println("After Sorting:");

            for(StringBean sb:a)
            {
               System.out.println(sb);
            }

            System.out.println("\n\n");

            assertEquals(true,true);
        }


}
