package JavaIntern;
	
	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Library library = new Library();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n===== Digital Library Management System =====");
	            System.out.println("1. Add a Book");
	            System.out.println("2. View All Books");
	            System.out.println("3. Search a Book by ID/Title");
	            System.out.println("4. Update Book Details");
	            System.out.println("5. Delete a Book");
	            System.out.println("6. Exit System");
	            System.out.print("Choose an option: ");
	            
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Clear buffer

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Book ID: ");
	                    String bookId = scanner.nextLine();
	                    System.out.print("Enter Title: ");
	                    String title = scanner.nextLine();
	                    System.out.print("Enter Author: ");
	                    String author = scanner.nextLine();
	                    System.out.print("Enter Genre: ");
	                    String genre = scanner.nextLine();
	                    System.out.print("Enter Availability (Available/Checked Out): ");
	                    String availability = scanner.nextLine();
	                    library.addBook(new Book(bookId, title, author, genre, availability));
	                    break;

	                case 2:
	                    library.viewBooks();
	                    break;

	                case 3:
	                    System.out.print("Enter Book ID or Title to search: ");
	                    String key = scanner.nextLine();
	                    Book foundBook = library.searchBook(key);
	                    if (foundBook != null) {
	                        System.out.println(foundBook);
	                    } else {
	                        System.out.println("Book not found.");
	                    }
	                    break;

	                case 4:
	                    System.out.print("Enter Book ID to update: ");
	                    String updateId = scanner.nextLine();
	                    library.updateBook(updateId, scanner);
	                    break;

	                case 5:
	                    System.out.print("Enter Book ID to delete: ");
	                    String deleteId = scanner.nextLine();
	                    library.deleteBook(deleteId);
	                    break;

	                case 6:
	                    System.out.println("Exiting system. Goodbye!");
	                    scanner.close();
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}
