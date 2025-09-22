// Develop a Java application that determines whether any of several
//department-store customers has exceeded the credit limit on a
//charge account.
//For each customer,the following facts are available:
//a) account number
//b) balance at the beginning of the month
//c) total of all items charged by the customer this month
//d) total of all credits applied to the customer’s account this
//month
//e) allowed credit limit.
//The program should input all these facts as integers, calculate
//the new balance (= beginning balance+ charges – credits)
//display the new balance and determine whether the new balance
//exceeds the customer’s credit limit. For those customers whose
//credit limit is exceeded, the program should display the message "Credit limit exceeded".


package sunbeam.com;

import java.util.Scanner;

public class Creditlimitcalculater
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("Enter the Account No =");
		int acnumber=sc.nextInt();
		
		System.out.printf(" Enter balance at the beginning of the month");
		int beginningbalance=sc.nextInt();
		
		System.out.printf(" Enter total of all items charged by the customer this month");
		int charges=sc.nextInt();
		
		System.out.printf(" Enter total of all credits applied to the customers account thismonth");
		int credits=sc.nextInt();
		
		System.out.printf(" Enter allowed credit limit.");
		int creditlimit=sc.nextInt();
		
		int newbalance=beginningbalance+charges-credits;
		
		if(newbalance > creditlimit) 
		{
			System.out.println("Credit limit exceeded");
		}
		else
		{
			System.out.println("Credit limit  not exceeded");
		}
		sc.close();
		
	}

}
