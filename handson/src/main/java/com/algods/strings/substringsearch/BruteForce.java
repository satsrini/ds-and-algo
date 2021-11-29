package com.algods.strings.substringsearch;

/**
  * <h1>BruteForce</h1>
  * This class is an implementation of BruteForce
  * <p> Implementation of BruteForce method for substring search in Java
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-11-28
  */



public class BruteForce
{
   public BruteForce()
   {

   }

   public int search(String text, String pat)
   {
      int result = -1;

      int N = text.length();
      int M = pat.length();

      for(int i = 0; i < N-M+1; i++)
      {

         int j = 0;
         for(; j < M; j++)
         {
            if(text.charAt(i + j) != pat.charAt(j))
            {
               break;
            }
         }

         if(j == M)
         {
            result = i;
            break;
         }

      }

      return result;

   }

   public int alternateSearch(String text, String pat)
   {
     int result = -1;
    
     int N = text.length();
     int M = pat.length();

     for(int i = 0; i < N - M +1; i++)
     {
        int j = 0;

        for(; j < M; i++,j++)
        {
           if(text.charAt(i) != pat.charAt(j))
           {
              break;
           }

        }

        i = i - j;
        if(j == M)
        {
          result = i;
          break;
        }

     }

     return result;

   }

}
