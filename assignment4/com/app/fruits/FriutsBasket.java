package com.app.fruits;

import java.util.Scanner;

public class FriutsBasket {

	static int menulist()
	{
		int choice ;
		Scanner sc=new Scanner(System.in);
		System.out.println("0. Exit");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display names of all fruits in the basket ");
		System.out.println("5. Display name, color, weight, taste of all fresh fruits, in the basket ");
		System.out.println("6. Display tastes of all stale (not fresh) fruits in the basket");
		System.out.println("7. Mark a fruit as stale i/p ");
		System.out.println("8. Mark all sour fruits stale ");
		System.out.println("Enter choice");
		choice=sc.nextInt();
		return choice ;
		
	}


	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter basket size: ");
        int size = sc.nextInt();
        Friuts[] basket = new Friuts[size];
        int counter = 0;

        int choice=menulist();
		
		while(choice!=0)
		{
			choice=menulist();
			switch(choice)
			{
		
	     case 1:
	    	 if (counter < size) 
	    	 {
	    		 sc.nextLine(); 
                 System.out.print("Enter mango name: ");
                 String mangoName = sc.nextLine();
                 System.out.print("Enter mango weight: ");
                 double mangoWeight = sc.nextDouble();
                 sc.nextLine(); 
                 System.out.print("Enter mango color: ");
                 String mangoColor = sc.nextLine();
                 basket[counter++] = new Mango(mangoName, mangoColor, mangoWeight);
             } 
	    	 else 
	    	 {
                 System.out.println("Basket is full");
             }
             break;
             
           case 2:
           
        	   if (counter < size) 
  	    	 {
        		   sc.nextLine();
                   System.out.print("Enter orange name: ");
                   String mangoName = sc.nextLine();
                   System.out.print("Enter orange weight: ");
                   double mangoWeight = sc.nextDouble();
                   sc.nextLine(); 
                   System.out.print("Enter orange color: ");
                   String mangoColor = sc.nextLine();
                   basket[counter++] = new Orange(mangoName, mangoColor, mangoWeight);
               } 
  	    	 else 
  	    	 {
                   System.out.println("Basket is empty");
               }
               break;
        	   
          case 3:
        	  if (counter < size) 
 	    	 {
        		  sc.nextLine();
                  System.out.print("Enter apple name: ");
                  String mangoName = sc.nextLine();
                  System.out.print("Enter apple weight: ");
                  double mangoWeight = sc.nextDouble();
                  sc.nextLine(); 
                  System.out.print("Enter apple color: ");
                  String mangoColor = sc.nextLine();
                  basket[counter++] = new Apple(mangoName, mangoColor, mangoWeight);
              } 
 	    	 else 
 	    	 {
                  System.out.println("Basket is empty");
              }
              break;
          
          case 4:
        	  for ( Friuts fruit : basket) 
        	  {
                  if (fruit != null)
                  {
                      System.out.println(fruit.getName());
                  }
              }
          break;
          case 5:
              for (Friuts fruit : basket) 
              {
                  if (fruit != null && fruit.isFresh()) 
                  {
                      System.out.println(fruit.toString());
                      System.out.println("Taste: " + fruit.taste());
                  }
              }
              break;
          case 6:
              for (Friuts fruit : basket)
              {
                  if (fruit != null && !fruit.isFresh()) 
                  {
                      System.out.println("Fruit Name: " + fruit.getName() + ", Taste: " + fruit.taste());
                  }
              }
              break;
          case 7:
              System.out.println("Enter index to mark fruit as stale");
              int index = sc.nextInt();
              if (index >= 0 && index < size && basket[index] != null) 
              {
                  basket[index].setFresh(false);
                  System.out.println("Fruit marked as stale");
              } 
              else 
              {
                  System.out.println("Enter valid index");
              }
              break;
          case 8:
              for (Friuts fruit : basket) 
              {
                  if (fruit != null && fruit.taste().equals("sour")) 
                  {
                      fruit.setFresh(false);
                  }
              }
              System.out.println("All sour fruits marked as stale");
              break;
      }

  }


        	 
                    
                    
                    
		}
			
	
		
	}

	




