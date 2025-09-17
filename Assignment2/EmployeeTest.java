import java.util.Scanner;

class Employee {
	String firstname;
     String lastname;
	double msalary;
	public Employee(String first,String last,double salary) {
		this.firstname=first;
		this.lastname=last;
		this.msalary=salary;
		
	}
	public void setfirstname(String firstname)
	{
		this.firstname=firstname;
	}
	public String getfirstname()
	{
		return firstname;
	}
	public void setlastname(String lastname)
	{
		this.lastname=lastname;
	}
	public String getlastname()
	{
		return lastname;
	}
	public void setmonthsalary(Double msalary)
	{
		if(msalary<0)
		{
			System.out.println("do not set its value");
			this.msalary=(Double) null;
		}
		else {
		this.msalary=msalary;
		}
	}
	public Double getmonthsalary()
	{
		return msalary;
	}
	public Double totalsalary()
	{
		Double totalsal;
		totalsal=this.getmonthsalary()*12;
//		System.out.println("Total Bill ="+totalsal);
		return totalsal;
	}
	public Double risesalary()
	{
		Double totalraisesal;
		totalraisesal=this.totalsalary()*12;
//		System.out.println("Total Bill ="+totalsal);
		return totalraisesal;
	}
}

public class EmployeeTest
{  
	public static void main(String args[])
	{
		Employee emp=new Employee(null, null, 0);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name =");
		emp.setfirstname(sc.nextLine());
		System.out.println("Enter Last  Name =");
		emp.setlastname(sc.nextLine());
		System.out.println("Enter Monthly Salary =");
		emp.setmonthsalary(sc.nextDouble());
		
		System.out.println("First name ="+emp.getfirstname());
		System.out.println("Last name ="+emp.getlastname());
		System.out.println("Monthly Salary ="+emp.getmonthsalary());
		
		System.out.println("Total Salary ="+emp.totalsalary());
		System.out.println("Raise 10% salary amount is ="+emp.risesalary());
	}

}
