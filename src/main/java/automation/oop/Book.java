package automation.oop;

public class Book {
	String name;
	Author author;
	int year;
	double price;
	int yearLast;

	/**
	 * @return This method returns the book name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return This method returns the book author
	 */
	public Author getAuthor() {
		return author;
	}

	/**
	 * @return This method returns the book year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @return This method returns the book price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param name
	 *        This is the Book name
	 * @param year
	 *        This is the Book year
	 * @param author
	 *        This is the Book author
	 * @param price
	 *        This is the Book price
	 */
	public Book(String name, int year, Author author, double price) {
		this.name = name;
		this.year = year;
		this.author = author;
		this.price = price;
	}

}
