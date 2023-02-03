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
      int n;
      int q;
      boolean prime = true;
      boolean even = true;
      boolean repeat = true;
      
      String outputName;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Name of the input file? (Probably numbers.txt): ");
      String inputName = keyboard.nextLine();
      File inputFile = new File(inputName);
      Scanner inputReader = new Scanner(inputFile);
      
      while (inputReader.hasNext())
      {
         n = inputReader.nextInt();
         System.out.println(n);
      }
      
      
      System.out.print("Name of the output file? (Probably numberSummary.txt): ");
      outputName = keyboard.nextLine();
      File outputFile = new File(outputName);
      
      PrintWriter outputWriter = new PrintWriter(outputFile);
      
      
      
      /**
         isPrime takes an integer value (n) and returns true if
         the number is prime, false otherwise.
         @param n integer to be tested to determine if prime.
         @return boolean value if n is prime.
      */
      /*
      public static void isPrime(int n)
      {
         
      }
      */
      
      /**
         isEven takes an integer value (n) and returns true if
         the number is even, false otherwise.
         @param n integer to be tested to determine if even.
         @return boolean value if n is even.
      */
      /*
      public static void isEven(int n)
      {
         
      }
      */
      
      /**
         isRepeatedDigits takes an integer value (n) and returns true if
         the number contains the same digit is adjacent
         locations in the number, false otherwise.
         @param n integer to be tested to determine repeated values.
         @return boolean value if n contains repeated values.
      */
      /*
      public static void isRepeatedDigits(int n)
      {
         
      }
      
      */
      
   }
}