// Create an application that calculates your daily driving cost, so that you can estimate how much money could be saved by car pooling, which also has other advantages such as reducing carbon emissions and reducing traffic congestion. The application should input the following information and display the user’s cost per day of driving to work:
//a) Total miles driven per day.
//b) Cost per gallon of gasoline.
//c) Average miles per gallon.
//d) Parking fees per day.
//e) Tolls per day.



package sunbeam.com;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter  Total miles driven per day= ");
		double totalmiles=sc.nextDouble();
		
		System.out.println(" Enter Cost per gallon of gasoline= ");
		double costgas=sc.nextDouble();
		
		System.out.println("Enter Average miles per gallon= ");
		double avgmiles =sc.nextDouble();
		
		System.out.println("Enter  Parking fees per day=");
		double parkingfee =sc.nextDouble();
		
		System.out.println(" Enter Tolls per day =");
		double tolls=sc.nextDouble();
		
		double gasolineCost = (totalmiles /avgmiles) * costgas;
        double totalCost = gasolineCost + parkingfee + tolls;
        System.out.println("Daily driving cost: " + totalCost);
        
        sc.close();

		
		
	}

}
