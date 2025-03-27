package JavaIntern;
	
	import java.util.ArrayList;
	import java.util.Scanner;

	public class Library {
	    private ArrayList<Book> bookList = new ArrayList<>();

	    // Add a book
	    public void addBook(Book book) {
	        bookList.add(book);
	        System.out.println("Book added successfully!");
	    }

	    // View all books
	    public void viewBooks() {
	        if (bookList.isEmpty()) {
	            System.out.println("No books available.");
	        } else {
	            for (Book book : bookList) {
	                System.out.println(book);
	            }
	        }
	    }

	    // Search a book by ID or Title
	    public Book searchBook(String key) {
	        for (Book book : bookList) {
	            if (book.getBookId().equalsIgnoreCase(key) || book.getTitle().equalsIgnoreCase(key)) {
	                return book;
	            }
	        }
	        return null;
	    }

	    // Update book details
	    public void updateBook(String bookId, Scanner scanner) {
	        Book book = searchBook(bookId);
	        if (book != null) {
	            System.out.println("Enter new Title: ");
	            book.setTitle(scanner.nextLine());
	            System.out.println("Enter new Author: ");
	            book.setAuthor(scanner.nextLine());
	            System.out.println("Enter new Genre: ");
	            book.setGenre(scanner.nextLine());
	            System.out.println("Enter new Availability (Available/Checked Out): ");
	            book.setAvailability(scanner.nextLine());
	            System.out.println("Book details updated successfully!");
	        } else {
	            System.out.println("Book not found.");
	        }
	    }

	    // Delete a book
	    public void deleteBook(String bookId) {
	        Book book = searchBook(bookId);
	        if (book != null) {
	            bookList.remove(book);
	            System.out.println("Book deleted successfully!");
	        } else {
	            System.out.println("Book not found.");
	        }
	    }
	}
