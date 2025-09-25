package com.app.vehicles;

import java.util.*;
import java.text.SimpleDateFormat;

public class Vehicle implements Comparable<Vehicle> {
    private int chasisNo;
    private String color;
    private double price;
    private String category;
    private Date date;

    public Vehicle() {}

    public Vehicle(int chasisNo, String color, double price, String category, Date date) {
        this.chasisNo = chasisNo;
        this.color = color;
        this.price = price;
        this.category = category;
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) throws CategoryNotMatchException {
        String[] validCategories = {"Petrol", "Diesel", "EV", "Hybrid", "CNG"};
        for (String s : validCategories) {
            if (category.equalsIgnoreCase(s)) {
                this.category = category;
                return;
            }
        }
        throw new CategoryNotMatchException("Invalid category: " + category);
    }

    public Date getDate() throws InvalidDateException {
        Calendar cal = Calendar.getInstance();

        cal.set(2021, Calendar.APRIL, 1);
        Date start = cal.getTime();

        cal.set(2022, Calendar.MARCH, 31);
        Date end = cal.getTime();

        if (date.before(start) || date.after(end)) {
            throw new InvalidDateException("Date out of range: " + date);
        }
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getChasisNo() {
        return chasisNo;
    }

    public void setChasisNo(int chasisNo) {
        this.chasisNo = chasisNo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Vehicle)) return false;
        Vehicle other = (Vehicle) obj;
        return this.chasisNo == other.chasisNo;
    }

    

    @Override
    public int compareTo(Vehicle o) {
        return Integer.compare(this.chasisNo, o.chasisNo);
    }

    @Override
    public String toString() {
        return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", price=" + price +
                ", category=" + category + ", date=" + date + "]";
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter chasisNo: ");
        this.chasisNo = sc.nextInt();

        System.out.print("Enter color: ");
        this.color = sc.next();

        System.out.print("Enter category: ");
        try {
            this.setCategory(sc.next());
        } catch (Throwable e) {
            System.out.println(e);
            this.category = "Unknown";
        }

        System.out.print("Enter price: ");
        this.price = sc.nextDouble();

        System.out.print("Enter manufacture date (dd-MM-yyyy): ");
        String dateStr = sc.next();
        try {
            this.date = new SimpleDateFormat("dd-MM-yyyy").parse(dateStr);
        } catch (Exception e) {
            System.out.println("Invalid date format! Setting to default 01-04-2021");
            try {
                this.date = new SimpleDateFormat("dd-MM-yyyy").parse("01-04-2021");
            } catch (Exception ex) {}
        }
    }
}
