
import java.util.Scanner;

public class Average {

public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	double num1;
	double num2;
	double avg;
	System.out.println("Enter num1:");
	if(sc.hasNextDouble() && !sc.hasNextInt())
	{
	num1=sc.nextDouble();
	System.out.println("Enter num2:");
	if(sc.hasNextDouble() && !sc.hasNextInt())
	{
	num2=sc.nextDouble();
	System.out.println("Average of two numbers is :"+(num1+num2)/2);
				
}
else
 {
	System.out.println("Enter pure double values");
 }
	}
	else 
	{
				System.out.println("Enter pure double values");
			}
		}

	}



