package a1;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private List<Book> books;
	
	public Library() {
		books= new ArrayList<>();
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("ISBN: " + book.getISBN());
            System.out.println("Author: " + book.getAuthor().getName());
            System.out.println();
        }
	
	}

}
