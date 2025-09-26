//Q1. Create a menu driven code that have below menus
//1. add the student in the collection - accept the details from user and add in the collection 
//2. Display all the students using iterator.
//3. search the student on rollno and if found display his details.
//4. sort the students on rollno
//5. sort the students on name
//6. sort the students on marks
//(Hint - use List Interface and Object of ArrayList)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Scanner;

import java.util.Comparator;

class Program {
	private int rollno;
	private String name;
	private double marks;
	public Program()
	{
		
	}
	public Program(int rollno,String name,double marks)
	{
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
	public Program(int rollno)
	{
		this.rollno=rollno;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return String.format("%-20d%-10s%-20f",rollno,name,marks );
	
}
	@Override
	public boolean equals(Object obj) 
	{
		if(this==null)
		return false;
		if(this==obj)
			return true;
		if(!(obj instanceof Program))
			return false;
		Program other=(Program) obj;
		if(this.rollno==other.rollno)
			return true;
		return false;
	}	
}

public class Student
{
	static Scanner sc=new Scanner(System.in);
	static List<Program> stdlist=new ArrayList<>();
	public  static void accept()
	{
		System.out.println("Enter the Roll No=");
		int rollno=sc.nextInt();
		System.out.println("Enter the Name");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter the Marks");
		double marks=sc.nextDouble();
		System.out.println(name);
		stdlist.add(new Program(rollno,name,marks));	
	}
	public static void displayAll()
	{
		Iterator<Program> trav=stdlist.iterator();
		while(trav.hasNext())
		{
			Program ele=trav.next();
			System.out.println(ele);
		}
	}
	public static  void searchByRollno()
	{
	 System.out.println("Enter Rollno you want to find");
	 int rollno=sc.nextInt(); 
	 Program key=new Program(rollno);
	 int stdrollno=stdlist.indexOf(key);
	 System.out.println(stdrollno);
	 if(stdrollno!=-1)
	 {
		
	System.out.println(	stdlist.get(stdrollno));
	 }
	 else
	 {
		 System.out.println("Id not Found");
	 }
	}
	

	public static int Menulist()
	{
		int choice;
		System.out.println("0.Exit");
		System.out.println("1.add the student");
		System.out.println("2.Display all the students");
		System.out.println("3.search the student on rollno and if found display his details");
		System.out.println("4.sort the students on rollno");
		System.out.println("5.sort the students on name");
		System.out.println("6.sort the students on marks");
		System.out.printf("Enter Your Choice=");
		choice=sc.nextInt();
		return choice;	
	}
	public static void main(String[] args)
	{
		int[] arr=new int[1];
		 Comparator<Program> comparator = null;
		
		int choice;
		while((choice=Menulist())!=0)
		{
			switch(choice)
			{
			case 1:
				Student.accept();
				break;
			case 2:
				Student.displayAll();
				break;
			case 3:
				Student.searchByRollno();
				break;
			case 4:
				comparator=new sortByRollno();
				System.out.println("");
				break;
			case 5:
				comparator=new sortByName();
				break;
			case 6:
				comparator=new sortByMarks();
				
				
				
			}
			if(comparator!=null) {
				stdlist.sort(comparator);
				Student.displayAll();
		}
		
	}
	
	}
}

		
		
	
