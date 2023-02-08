/**
   Ashton Putnam
   CS 110-A
   Homework #3 - NumberTester: a program that opens a file
   of integers numbers.txt and produces an output file that 
   contains  a table with each integer from the input file 
   and an indication of the properties of the file. The three 
   properties will be: does it contian repeating (adjacent)
   digits? Is it even? is It prime?
*/

import java.util.Scanner; //Make a scanner for keyboard input
import java.io.*; //Import IO for file input and output

public class NumberTester
{
   public static void main(String [] args) throws Exception
   {
      Scanner infile;
      infile = new Scanner(new File("numbers.txt"));
      
      PrintWriter outfile;
      outfile = new PrintWriter("numberSummary.txt");
      
      String s = ("Repeat");
      String b = ("Number");
      String m = ("Digits");
      String o = ("Even");
      String g = ("Prime");
         
      outfile.printf("%15s\n", s);
      outfile.printf("%7s %7s %7s %7s\n", b, m ,o, g);
      
      while (infile.hasNext())
      {
         int n = infile.nextInt();
         String r1;
         String r2;
         String r3;
                  
         if(isRepeatedDigits(n))
            r1 = "+";
         else
            r1 = "-";
         
         if(isEven(n))
            r2 = "+";
         else
            r2 = "-";
         
         if(isPrime(n))
            r3 = "+";
         else
            r3 = "-";
         
         outfile.printf("%5d %6s %8s %7s\n", n, r1, r2, r3); 
      }
      
      infile.close();
      outfile.close();
   }
   
                  
   /**
      isPrime takes an integer value (n) and returns true if
      the number is prime, false otherwise.
      @param n integer to be tested to determine if prime.
      @return boolean value if n is prime.
   */
   public static boolean isPrime(int n)
   {  
      for (int i = 2; i <= n - 1; i++)
      {
         if ((n % i) == 0)
         {
            return false;
         }
      }
      return true;  
   }  
     
      
   /**
      isEven takes an integer value (n) and returns true if
      the number is even, false otherwise.
      @param n integer to be tested to determine if even.
      @return boolean value if n is even.
   */
   public static boolean isEven(int n)
   {
      if (n % 2 == 0)
      {
         return true;
      }
      return false;
   }

   
   /**
      isRepeatedDigits takes an integer value (n) and returns true if
      the number contains the same digit is adjacent
      locations in the number, false otherwise.
      @param n integer to be tested to determine repeated values.
      @return boolean value if n contains repeated values.
   */
   public static boolean isRepeatedDigits(int n)
   {
      String s = "" + n;
      
      int i;
      
      for (i=0; i < s.length()-1; i++)
      {
         
         
         if(s.charAt(i) == s.charAt(i+1))
         {
            return true;
         }
      }
   return false;
   }
}