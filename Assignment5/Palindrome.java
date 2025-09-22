//Q2) Write a java code to check string is palindrome.
package sunbeam.com;

import java.util.Scanner;

public class Palindrome
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the String =");
        String input = sc.nextLine();
        
        if (isPalindrome(input)) 
        {
            System.out.println(input + " is a palindrome.");
        }
        else
        {
            System.out.println(input + " is not a palindrome.");
            sc.close();
        }
    }

    public static  boolean isPalindrome(String input) 
    {
        int left = 0;
        int right = input.length() - 1;
        while (left < right)
        {
            if (input.charAt(left) != input.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
