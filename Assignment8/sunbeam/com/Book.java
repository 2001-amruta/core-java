//1. Store book details in a library in a list -- ArrayList.
//Book details: isbn(string), price(double), authorName(string), quantity(int)
//Write a menu driven program to
//1. Add new book in list
//2. Display all books in forward order
//3. Display all books in reverse order
//4. Delete a book at given index.
//5. Sort all books by price in desc order -- list.sort();

package sunbeam.com;

  public class Book
{
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	public Book()
	{
		
	}
	public Book(String isbn,double price,String authorName,int quantity)
	{
		this.isbn=isbn;
		this.price=price;
		this.authorName=authorName;
		this.quantity=quantity;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Library [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}
}

