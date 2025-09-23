package sunbeam.comm;

import java.util.Scanner;
public class Program1
{
    public static void main(String[] args)
    {
        try {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter the myx value");
        	Double myX=sc.nextDouble();
        	System.out.println("Enter the myy value");
        	Double myY=sc.nextDouble();
        	System.out.println("Enter the diemeter value");
        	Double mydiameter=sc.nextDouble();
            Circle circle = new Circle();
            circle.setMyX(myX);
            circle.setMyY(myY);
            circle.setMyDiameter(mydiameter);
            sc.close();
       }
        catch (DiameterException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
