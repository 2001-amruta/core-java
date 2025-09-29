//Q3) Write a Java program to replace the second element of
//a ArrayList with the specified element.

package sunbeam.com;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args)
	{
		List<String>color=new ArrayList<>();
		color.add("Red");
		color.add("Blue");
		color.add("Pink");
		System.out.println("Array List=");
		for(String aa:color)
			System.out.println(aa);
		System.out.println("\nArray list With rename=");
		color.set(2, "Black");
		for(String ba:color)
			System.out.println(ba);
			
		
	}

}
