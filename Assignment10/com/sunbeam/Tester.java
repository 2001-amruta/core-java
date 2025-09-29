package com.sunbeam;

import java.util.Scanner;

public class Tester
  {
    static Stack stack = null;

    public static int menuList()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Choose Fixed Stack");
        System.out.println("2. Choose Growable Stack");
        System.out.println("3. Push data");
        System.out.println("4. Pop data");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");
        return sc.nextInt();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) 
        {
            choice = menuList(); 

            switch (choice) 
            {
                case 1:
                    stack = new FixedStack();
                    System.out.println("Fixed Stack selected.");
                    break;
                case 2:
                    stack = new GrowableStack();
                    System.out.println("Growable Stack selected.");
                    break;
                case 3:
                    if (stack == null)
                    {
                        System.out.println("Please choose a stack first!");
                        break;
                    }
                    System.out.print("Enter id: ");
                    int id = sc.nextInt();
                    System.out.print("Enter name: ");
                    String name = sc.next();
                    System.out.print("Enter salary: ");
                    double salary = sc.nextDouble();
                    Employee e = new Employee(id, name, salary);
                    stack.push(e);
                    break;
                case 4:
                    if (stack == null) {
                        System.out.println("Please choose a stack first!");
                        break;
                    }
                    Employee e1 = stack.pop();
                    if (e1 != null)
                        System.out.println("Popped: " + e1);
                    else
                        System.out.println("Stack is empty.");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }

        
    }
}
