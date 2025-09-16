import java.util.Scanner;

public class program {

	private static final String String = null;

	public static void main(String[] args) {
	
       Scanner sc = new Scanner(System.in);	
       System.out.printf("Enter a Number =");
       int a=sc.nextInt();
       System.out.print("Given Number ="+a);
       System.out.println();
       String binary= Integer.toBinaryString(a);
       System.out.println("Binary Equivalent ="+binary);
       String octal =Integer.toOctalString(a);
       System.out.println("Octal Equivalent ="+octal);
       String hexa=Integer.toHexString(a);
       System.out.println("Hexa Decimal ="+hexa);
	}
}
