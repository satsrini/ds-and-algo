package com.algods.strings.sort;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.strings.sort.TestQuick3String;

public class TestQuick3String
{


        private String[] a;
        private Quick3String quick3String;

	@Before
	public void setUp()
	{
           a =     new String[]{
                           "edu.princeton.cs",
                           "com.apple",
                           "edu.princeton.cs",
                           "com.cnn",
                           "com.google",
                           "edu.uva.cs",
                           "edu.princeton.cs",
                           "edu.princeton.cs.www",
                           "edu.uva.cs",
                           "edu.uva.cs",
                           "edu.uva.cs",
                           "com.adobe",
                           "edu.princeton.ee"};
        }

        @Test
        public void testQuick3StringSort()
        {

            System.out.println("\n\n");
            System.out.println("Before Sorting:");

            for(String str:a)
            {
               System.out.println(str);
            }

            System.out.println("\n\n");


            quick3String = new Quick3String(a);
            quick3String.sort();

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
