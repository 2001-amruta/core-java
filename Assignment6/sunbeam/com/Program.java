package sunbeam.com;

import java.util.Scanner;
public class Program{


	public static void main(String[] args) 
	{
        try  
        {
        	Scanner sc=new Scanner(System.in);
            System.out.println("Enter the String=");
            String ch = sc.nextLine();
            Longstring l1 = new Longstring(ch);
            System.out.println("String accepted: " + l1.toString());
            l1.setCh(ch);
            sc.close();
        } 
        catch (ExceptionLinetoolong ex)
        {
            System.out.println("Error: String length exceeds the limit.");
            System.out.println("Field=" + ex.getInvalidField());
            System.out.println("Value=" + ex.getInvalidValue());
            System.out.println("Message=" + ex.getMessage());
        }
       
}
	
}