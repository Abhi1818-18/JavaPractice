package a1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("Enter author name (or type 'exit' to stop):");
            String authorName = scanner.nextLine();
            if (authorName.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter author age:");
            int authorAge = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter book title:");
            String bookTitle = scanner.nextLine();

            System.out.println("Enter ISBN:");
            String isbn = scanner.nextLine();

            Author author = new Author(authorName, authorAge);
            Book book = new Book(bookTitle, isbn, author);
            library.addBook(book);
        }

        // Display all books in the library
        library.displayBooks();

        scanner.close();
    }
}
