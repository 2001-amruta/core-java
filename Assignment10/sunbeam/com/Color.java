//Q2) Write a Java program to create a new array list, add some colors
//(string) and print out the collection as sorted list.

package sunbeam.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Color {

	public static void main(String[] args) {
		 List<String> list=new ArrayList<>();
		 System.out.println("Array List=");
		  Collections.addAll(list, "Yellow","Blue","Red","Blace","White","Pink");
		  for(String ab:list)
			  System.out.println(ab);
		  System.out.println("\nSorted List");
		  Collections.sort(list);
		   for(String aa:list)
			   System.out.println(aa);
	}

}
