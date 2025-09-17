


import java.util.Scanner;

class Invoice {
    private String parts;
    private String des;
    private int qty;
    private double price;

    public Invoice() {}

    public void setParts(String parts) {
        this.parts = parts;
    }

    public String getParts() {
        return parts;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getDes() {
        return des;
    }

    public void setQty(int qty) {
        if (qty < 0) {
            System.out.println("Invalid quantity. Set to 0.");
            this.qty = 0;
        } else {
            this.qty = qty;
        }
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Invalid price. Set to 0.");
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public double totalBill() {
        double total = this.getQty() * this.getPrice();
        System.out.println("Total Bill: " + total);
        return total;
    }
}

public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Invoice in = new Invoice();
        System.out.print("Enter Parts: ");
        in.setParts(sc.nextLine());
        System.out.print("Enter Description: ");
        in.setDes(sc.nextLine());
        System.out.print("Enter Quantity: ");
        in.setQty(sc.nextInt());
        System.out.print("Enter Price: ");
        in.setPrice(sc.nextDouble());
        sc.close(); // Close the scanner to prevent resource leaks

        System.out.println("Parts: " + in.getParts());
        System.out.println("Description: " + in.getDes());
        System.out.println("Quantity: "+ in.getQty());
        System.out.println("Price: " + in.getPrice());
        in.totalBill();
    }
}


