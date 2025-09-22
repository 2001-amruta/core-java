//Q1) Write a java program to reverse a String
package sunbeam.com;

import java.util.Scanner;

public class Reverse
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String =");
		 String ch = sc.nextLine();
	      String reversed = reverseString(ch);
	      System.out.println("Reversed string: " + reversed);
	      sc.close();
	    }

	    public static String reverseString(String input) 
	    {
	        StringBuilder sb = new StringBuilder(input);
	        return sb.reverse().toString();
	    }
	}



