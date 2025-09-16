import java.util.Scanner;

public class Foodmenu
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		double totalbill=0;
		do{
		System.out.println("0.Exit");
		System.out.println("1.Idli Rs:10 ");
		System.out.println("2.Dosa Rs:10");
		System.out.println("3.Samosa Rs:10");
		System.out.println("4.TotalBill");
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		
		switch(choice) 
		{
		case 1:
			  System.out.println("Enter idli quantity:");
		      int idliquantity;
		      idliquantity=sc.nextInt();
		      double idlibill=10*idliquantity;
		      totalbill=totalbill+ idlibill;
		      break;
		case 2: 
			    System.out.println("Enter dosa quantity:");
	            int dosaquantity;
	            dosaquantity=sc.nextInt();
	            double dosabill=10*dosaquantity;
	            totalbill=totalbill+ dosabill;
	            break; 
		case 3: 
			   System.out.println("Enter samosa quantity:");
                int samosaquantity;
                samosaquantity=sc.nextInt();
                double samosabill=10*samosaquantity;
                totalbill=totalbill+ samosabill;
                break;
		case 4:
			System.out.println("totalbill:"+totalbill);
			break;
		default:
			System.out.println("You Enter Wrong Choice");
		}
		
	}while(choice!=0);
		}


}
