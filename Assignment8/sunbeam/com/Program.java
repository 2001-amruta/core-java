
package sunbeam.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Program {
    static Scanner sc = new Scanner(System.in);
    static List<Book> bookList = new ArrayList<>();

    public static void addBook()
    {
        System.out.print("Enter isbn: ");
        String isbn = sc.next();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        System.out.print("Enter author name: ");
        String authorName = sc.next();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        bookList.add(new Book(isbn, price, authorName, quantity));
    }

    public static void displayBooks() {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    public static void sortBooks() {
        Collections.sort(bookList, new BookComparator());
    }

    public static void displayBooksInReverseOrder() {
        for (int i = bookList.size() - 1; i >= 0; i--) {
            System.out.println(bookList.get(i));
        }
    }

    public static void deleteBook() {
        System.out.print("Enter index to delete: ");
        int index = sc.nextInt();
        if (index >= 0 && index < bookList.size()) {
            bookList.remove(index);
        } else {
            System.out.println("Invalid index");
        }
    }

    public static int menuList() {
        int choice;
        System.out.println("0.Exit");
        System.out.println("1.Add new book in list");
        System.out.println("2.Display all books in forward order");
        System.out.println("3. Display all books in reverse order");
        System.out.println("4.Delete a book at given index");
        System.out.println("5.Sort all books by price in desc order");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        int choice;
        while ((choice = menuList()) != 0) {
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    displayBooks();
                    break;
                case 3:
                    displayBooksInReverseOrder();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    sortBooks();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}




