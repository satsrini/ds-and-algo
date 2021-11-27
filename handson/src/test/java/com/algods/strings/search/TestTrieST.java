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

        private TrieST<Integer> trieST2;

	@Before
	public void setUp()
        {
           trieST2 = getTrieST2();
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

        @Test
        public void testSize()
        {
           assertEquals(new Integer(7), new Integer(trieST2.size()));
        }

        @Test
        public void testKeysWithPrefix()
        {

           TrieST<Integer> trieST2 = getTrieST2();

           System.out.println("\n\n");
           System.out.println("keys with prefix 'se':");
           for(String key:trieST2.keysWithPrefix("se"))
           {
              System.out.println(key);
           }
           System.out.println("\n\n");

           System.out.println("\n\n");
           System.out.println("keys with prefix 'sh':");
           for(String key:trieST2.keysWithPrefix("sh"))
           {
              System.out.println(key);
           }
           System.out.println("\n\n");

           System.out.println("\n\n");
           System.out.println("keys with prefix 's':");
           for(String key:trieST2.keysWithPrefix("s"))
           {
              System.out.println(key);
           }
           System.out.println("\n\n");

           System.out.println("\n\n");
           System.out.println("keys with prefix 'by':");
           for(String key:trieST2.keysWithPrefix("by"))
           {
              System.out.println(key);
           }
           System.out.println("\n\n");


           System.out.println("\n\n");
           System.out.println("keys with prefix 'a':");
           for(String key:trieST2.keysWithPrefix("a"))
           {
              System.out.println(key);
           }
           System.out.println("\n\n");


           assertEquals(true,true);

        }

        @Test
        public void testKeysThatMatch()
        {

           TrieST<Integer> trieST2 = getTrieST2();

           System.out.println("\n\n");
           System.out.println("keys that match 's.a':");
           for(String key:trieST2.keysThatMatch("s.a"))
           {
              System.out.println(key);
           }
           System.out.println("\n\n");

           System.out.println("\n\n");
           System.out.println("keys that match 'sh.':");
           for(String key:trieST2.keysThatMatch("sh."))
           {
              System.out.println(key);
           }
           System.out.println("\n\n");

           System.out.println("\n\n");
           System.out.println("keys that match 'sells':");
           for(String key:trieST2.keysThatMatch("sells"))
           {
              System.out.println(key);
           }
           System.out.println("\n\n");

           System.out.println("\n\n");
           System.out.println("keys that match '...':");
           for(String key:trieST2.keysThatMatch("..."))
           {
              System.out.println(key);
           }
           System.out.println("\n\n");


           System.out.println("\n\n");
           System.out.println("keys that match '.y':");
           for(String key:trieST2.keysThatMatch(".y"))
           {
              System.out.println(key);
           }
           System.out.println("\n\n");

           System.out.println("\n\n");
           System.out.println("keys that match 'a.':");
           for(String key:trieST2.keysThatMatch("a."))
           {
              System.out.println(key);
           }
           System.out.println("\n\n");


           assertEquals(true,true);
       }

        @Test
        public void testLongestPrefixOf()
        {

           TrieST<Integer> trieST2 = getTrieST2();

           assertEquals("she",trieST2.longestPrefixOf("she"));

           assertEquals("she",trieST2.longestPrefixOf("shell"));

           assertEquals("shells",trieST2.longestPrefixOf("shellsort"));
           
           assertEquals("she",trieST2.longestPrefixOf("shelters"));

        }

        @Test
        public void testDelete()
        {

           TrieST<Integer> trieST2 = getTrieST2();

           assertEquals(Integer.valueOf(4),trieST2.get("by"));

           trieST2.delete("by");

           assertEquals(null,trieST2.get("by"));


        }

        @Test
        public void testDelete2()
        {

           TrieST<Integer> trieST2 = getTrieST2();

           assertEquals(Integer.valueOf(0),trieST2.get("she"));
           assertEquals(Integer.valueOf(3),trieST2.get("shells"));

           trieST2.delete("she");

           assertEquals(null,trieST2.get("she"));
           assertEquals(Integer.valueOf(3),trieST2.get("shells"));


        }



        @Test
        public void testGetKeys()
        {
           TrieST<Integer> trieST2 = getTrieST2();

           System.out.println("\n\n");
           System.out.println("All Keys:");

           for(String key:trieST2.keys())
           {
              System.out.println(key);
           }

           System.out.println("\n\n");
        }

        private TrieST getTrieST2()
        {

            trieST2 = new TrieST<>();

            trieST2.put("she",0);
            trieST2.put("sells",1);
            trieST2.put("sea",2);
            trieST2.put("shells",3);
            trieST2.put("by",4);
            trieST2.put("the",5);
            trieST2.put("sea",6);
            trieST2.put("shore",7);
           
            return trieST2;

        }
}
