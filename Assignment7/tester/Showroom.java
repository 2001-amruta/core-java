package tester;

import java.util.*;
import com.app.vehicles.*;

public class Showroom {

    private static List<Vehicle> showroom = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Showroom Menu ---");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Display All Vehicles");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addVehicle(sc);
                    break;
                case 2:
                    displayVehicles();
                    break;
                case 3:
                    System.out.println("Exiting Showroom. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 3);

        sc.close();
    }

    private static void addVehicle(Scanner sc) {
        Vehicle v = new Vehicle();

        try {
            System.out.println("\n--- Add Vehicle ---");
            System.out.print("Enter chassisNo: ");
            v.setChasisNo(sc.nextInt());

            System.out.print("Enter color: ");
            v.setColor(sc.next());

            System.out.print("Enter category (Petrol/Diesel/EV/Hybrid/CNG): ");
            String categoryInput = sc.next();
            v.setCategory(categoryInput);

            System.out.print("Enter price: ");
            v.setPrice(sc.nextDouble());

            System.out.print("Enter manufacture date (dd-MM-yyyy): ");
            String dateStr = sc.next();
            Date date = new java.text.SimpleDateFormat("dd-MM-yyyy").parse(dateStr);
            v.setDate(date);
            v.getDate();

            showroom.add(v);
            System.out.println("Vehicle added successfully!");

        } catch (CategoryNotMatchException | InvalidDateException e) {
            System.out.println("Error: " + e);
        } catch (Exception e) {
            System.out.println("Error: Invalid date format!");
        }
    }

    private static void displayVehicles() {
        if (showroom.isEmpty()) {
            System.out.println("No vehicles in the showroom.");
        } else {
            System.out.println("\n--- All Vehicles in Showroom ---");
            for (Vehicle v : showroom) {
                System.out.println(v);
            }
        }
    }
}

