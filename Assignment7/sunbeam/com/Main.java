//2. Use Arrays.sort() to sort array of Students using Comparator. The 1st level sorting should be on city
//(desc), 2nd level sorting should be on marks (desc), 3rd level sorting should be on name (asc).
package sunbeam.com;

import java.util.Arrays;
import java.util.Comparator;

class Student {
    private String name;
    private String city;
    private double marks;

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

        Arrays.sort(students, (s1, s2) -> 
        {
            if (!s1.getCity().equals(s2.getCity())) 
                return s2.getCity().compareTo(s1.getCity());
            else if (s1.getMarks() != s2.getMarks()) 
                return Double.compare(s2.getMarks(), s1.getMarks());
            else 
                return s1.getName().compareTo(s2.getName());
        });


        for (Student student : students) 
        {
            System.out.println(student);
        }
    }
}


