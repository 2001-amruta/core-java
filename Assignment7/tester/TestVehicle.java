package tester;

import java.util.*;
import com.app.vehicles.*;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];

        for (int i = 0; i < vehicles.length; i++) {
           
            vehicles[i] = new Vehicle();
            vehicles[i].accept();
        }

        for (int i = 0; i < vehicles.length; i++) {
            for (int j = i + 1; j < vehicles.length; j++) {
                if (vehicles[i].equals(vehicles[j])) {
                    System.out.println("SAME");
                } else {
                    System.out.println("DIFFERENT");
                }
            }
        }

        System.out.println("Vehicles are:");
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }
}

