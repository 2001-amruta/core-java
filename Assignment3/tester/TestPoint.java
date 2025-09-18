package tester;

import com.app.geometry.Point2D;
import java.util.Scanner;

public class TestPoint
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates of point 1 (x y):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        Point2D p1 = new Point2D(x1, y1);

        System.out.println("Enter coordinates of point 2 (x y):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        Point2D p2 = new Point2D(x2, y2);

        System.out.println("Point 1 details: " + p1.getDetails());
        System.out.println("Point 2 details: " + p2.getDetails());

        if (p1==p2)
        {
            System.out.println("Points are same value.");
        } 
        else 
        {
            System.out.println("Points are not same value.");
            
            double distance = p1.calculateDistance(p2);
            
            System.out.println("Distance between points: " + distance);
        }

    }
}
