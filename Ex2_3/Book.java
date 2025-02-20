package Ex2_3;

public class Book {
	private String isbn;
	private String name;
	private Author author;
	private double price;
	private int qty;
	public Book() {

	}

	public Book(String isbn, String name, Author author, double price,int qty) {
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty=qty;
		qty=0;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", author=" + author + ", price=" + price + ", qty=" + qty
				+ "]";
	}
	public String getAuthorName() {
		return author.getName();
	}

}
