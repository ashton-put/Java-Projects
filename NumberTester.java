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
                  
      /**
         isPrime takes an integer value (n) and returns true if
         the number is prime, false otherwise.
         @param n integer to be tested to determine if prime.
         @return boolean value if n is prime.
      */

   public static boolean isPrime(int n)
   {
      boolean status;
         
      if (n > 0 && n % 2 == 0)
         status = true;
      else
         status = false;
            
      return status;
   }
      
      
      /**
         isEven takes an integer value (n) and returns true if
         the number is even, false otherwise.
         @param n integer to be tested to determine if even.
         @return boolean value if n is even.
      */
      /*
      public static boolean isEven(int n)
      {
         if (n > 0 && n % 2 == 0)
            return true;
         else
            return false;
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
      public static boolean isRepeatedDigits(int n)
      {
         String s = " " + num 
         Integer.toString()
         
         for (i=0; i<s.length()-1; i++)
            s.charAt(i)
      }
      */
   }
}

/*

prime: n/2 
output prints two seperate lines
then prints the formatted ouput data

577 - has repeating
575 - does not have repeating

take the number, convert to string, 
each single digit a character,

String s = "" + num 
Integer.toString()

s.charAt(i) - finds what character is at location

loop through characters, stop if you find that the character at i
and the character at i+1 is the same, or get to the end of the string

when looping through values, 

for (i=0; i<s.length()-1; i++)
   s.charAt(i)

//FORMATTING HEADER FOR OUTPUT:
//figure out spacing

   1[        Repeat
   2[Number Digit Prime Even
   3[477 +  -  -
   4[ %7s - MAGIC KEY TO SPACING
   
use an if statement in main to add + or -, methods
only return a boolean value

if(isPrime(n))
   result = "+"
else
   result = "-"
   
//PrintWriter REVIEW

attach to a file

PrintWriter outfile = new PrintWriter("results.txt")
{
   exactly the same use as System.out.
   
   outfile.print();
   outfile.println();
   outfile.printf();
}
outfile.close();
   


*/