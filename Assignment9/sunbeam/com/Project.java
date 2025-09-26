//Q2. Maintain a HashSet of projects and perform given operations in a menu-driven program.
//Ensure that projects are not duplicated by the project id in the set.
//Each project information includes int id, String title, int teamSize, double projectCost , String technology.
//1. Add Dummy Data of Projects in the Set
//2. Input a Project from user and add in Set
//3. Display all Projects in Set
//4. Delete a Project by Id from Set
//5. Copy All Projects from Set to ArrayList
//6. Display all Projects from List
//7. Sort all Projects in List by cost
//8. Find project with Max team size using Collections.max()

package sunbeam.com;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class Program {
    private int id;
    private String title;
    private int teamSize;
    private double projectCost;
    private String technology;
public Program()
{
	
}

 public Program(int id, String title, int teamSize, double projectCost, String technology)
 {
        this.id = id;
        this.title = title;
        this.teamSize = teamSize;
        this.projectCost = projectCost;
        this.technology = technology;
    }

    public int getId()
    { 
    	return id;
    	}
    public String getTitle() 
    {
    	return title; 
    	}
    public int getTeamSize() 
    { 
    	return teamSize;
    	}
    public double getProjectCost() 
    {
    	return projectCost;
    	}
    public String getTechnology() 
    {
    	return technology;
    	}

    @Override
    public String toString()
    {
        return "Program [id=" + id + ", title=" + title + ", teamSize=" + teamSize +
                ", projectCost=" + projectCost + ", technology=" + technology + "]";
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }

    
    public boolean equals(Object obj) 
    {
    	if(this==null)
    		return false;
        if (this == obj)
        	return true;
        if (!(obj instanceof Program)) 
        	return false;
        Program other = (Program) obj;
        if( this.id == other.id);
             return true;
//          return false;
    }
}


class SortByCost implements Comparator<Program>
{
    @Override
    public int compare(Program p1, Program p2) 
    {
        return Double.compare(p1.getProjectCost(), p2.getProjectCost());
    }
}

public class Project
{
    static Scanner sc = new Scanner(System.in);
    static Set<Program> promap = new HashSet<>();
    static List<Program> listmap = new ArrayList<>();

    public static void addDummy() 
    {
        promap.add(new Program(1, "Train Reservation System", 10, 5000000, "Java"));
        promap.add(new Program(2, "Airline Reservation System", 8, 6000000, ".NET"));
        promap.add(new Program(4, "Online Grocery Shop", 6, 3000000, "Java"));
        promap.add(new Program(5, "Online Book Shop", 2, 3000000, ".NET"));
        promap.add(new Program(3, "Online Jewelry Shop", 4, 4000000, "Java"));
        promap.add(new Program(6, "Bus Reservation System", 3, 3500000, "JS"));
        displayAll();
    }

    public static void addList()
    {
        System.out.print("Enter id = ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Title = ");
        String title = sc.nextLine();
        System.out.print("Enter teamSize = ");
        int teamSize = sc.nextInt();
        System.out.print("Enter projectCost = ");
        double projectCost = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Enter technology = ");
        String technology = sc.nextLine();
        promap.add(new Program(id, title, teamSize, projectCost, technology));
    }

    public static void displayAll() 
    {
        for (Program p : promap)
            System.out.println(p);
    }

    public static void deletebyid() 
    {
    	System.out.println("Enter id for delete record="); 
    	int id=sc.nextInt(); 
    	for (Program program : promap) 
    	{ 
    		if (program.getId() == id) 
    		{
    			System.out.println(program); return;
    			} 
    		} 
    	System.out.println("ID not Found"); 
    	}
    

    public static void copyToList() 
    {
        listmap.clear();
        listmap.addAll(promap);
        System.out.println("Set copied into the List");
    }

    public static void displayList()
    {
        for (Program p : listmap)
            System.out.println(p);
    }

    public static void sortByCost()
    {
        listmap.sort(new SortByCost());
        System.out.println("List sorted by cost:");
        displayList();
    }

    public static void findProjectMax()
    {
        Program maxTeamSizeProject = Collections.max(promap, Comparator.comparingInt(Program::getTeamSize));
        System.out.println("Project with max team size: " + maxTeamSizeProject);
    }

    public static int menuList()
    {
        System.out.println("0.Exit");
        System.out.println("1. Add Dummy Data of Projects in the Set");
        System.out.println("2. Input a Project from user and add in Set");
        System.out.println("3. Display all Projects in Set");
        System.out.println("4. Delete a Project by Id from Set");
        System.out.println("5. Copy All Projects from Set to ArrayList");
        System.out.println("6. Display all Projects from List");
        System.out.println("7. Sort all Projects in List by cost");
        System.out.println("8. Find project with Max team size using Collections.max()");
        System.out.print("Enter your choice = ");
        return sc.nextInt();
    }

    public static void main(String[] args)
    {
        int choice;
        while ((choice = menuList()) != 0) 
        {
            switch (choice) {
                case 1: 
                	addDummy();
                    break;
                case 2:
                	addList();
                    break;
                case 3:
                	displayAll();
                    break;
                case 4:
                	deletebyid();
                    break;
                case 5:
                	copyToList(); 
                    break;
                case 6:
                	displayList();
                    break;
                case 7:
                	sortByCost(); 
                    break;
                case 8:
                	findProjectMax(); 
                    break;
                default:
                	System.out.println("Enter Invalid Choice");
                	break;
            }
        }
        
    }
}

