import java.util.Scanner;

class abc {
	private int date;
	private int month;
	private int year;
	public abc(int date,int month ,int year)
	{
		this.date=date;
		this.month=month;
		this.year=year;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void display()
	{
		System.out.println("Date ="+this.getDate() +"/" +this.getMonth() +"/" +this.getYear());
	}

}

public class Date{
	public static void main(String [] args)
	{
	abc aa=new abc( 0, 0 , 0);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Date =");
	aa.setDate(sc.nextInt());
	System.out.println("Enter Month =");
	aa.setMonth(sc.nextInt());
	System.out.println("Enter Year =");
	aa.setYear(sc.nextInt());
	
	aa.display();
	}
	
}
