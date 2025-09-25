//2. Use Arrays.sort() to sort array of Students using Comparator. 
//The 1st level sorting should be on city (desc),
//2nd level sorting should be on marks (desc),
//3rd level sorting should be on name (asc).

package sunbeam.com;

import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparator<Student> {
    private String name;
    private String city;
    private double marks;

    public Student() {
        
    }

    public Student(String name, String city, double marks) {
        this.name = name;
        this.city = city;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", city=" + city + ", marks=" + marks + "]";
    }

    @Override
    public int compare(Student s1, Student s2) {
        
        int diff = s2.getCity().compareTo(s1.getCity());
        if (diff == 0) {
         
            diff = Double.compare(s2.getMarks(), s1.getMarks());
        }
        if (diff == 0) {
            
            diff = s1.getName().compareTo(s2.getName());
        }
        return diff;
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Amruta", "Akluj", 80),
                new Student("Anisha", "Mumbai", 95),
                new Student("Amruta", "Akluj", 85),
                new Student("Anuja", "Solapur", 90),
                new Student("Anisha", "Mumbai", 70)
        };

       
        Arrays.sort(students, new Student());

        
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
