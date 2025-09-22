//Q3) write a java program to count number of words in a String.
//Hint: You can use , trim() , length() and split() methods
package sunbeam.com;

import java.util.Scanner;

public class Count {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String =");
		String ch =sc.nextLine();
		System.out.println("Length of String is ="+ch.length());
		System.out.println("Using trim() method is ="+ch.trim());
		System.out.println("Using trim() method length is ="+ch.trim().length());
		String[] parts=ch.split(" ");
		for(String part : parts)
		System.out.println("using split() method is="+part.toString());
		
		sc.close();
	}

}
