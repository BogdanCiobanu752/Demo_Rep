package automation.oop;

/**
 * @author Bogdan Ciobanu
 *
 */
public class Library {

	public static void main(String[] args) {

		Author testAuthor = new Author("Jon", "Jon@.com");
		// System.out.println("Nume este " + testAuthor.getName() + " si email este " + testAuthor.getEmail());

		Book testBook = new Book("Harry Potter", 2015, testAuthor, 25.5);

		System.out.println("Book " + testBook.getName() + "(" + testBook.getPrice() + ")RON, by " + testAuthor.getName()
				+ ", published in year " + testBook.getYear());

		// testAuthor.getName() ia numele din Author si nu din Book...este mai corect cum este jos
		System.out.println(testBook.getAuthor()
				.getName());

	}

}
