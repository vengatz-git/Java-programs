package PracticeCode;

class Book {
    private String author;
    private String name;
    private int isbn;

    public Book(String author, String name, int isbn) {
        this.author = author;
        this.name = name;
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
    }

    public void display() {
        System.out.println("[Author = " + author + ", Name = " + name + ", ISBN = " + isbn + "]");
    }
}

public class BookTask {
    private static Book[] books = new Book[100];  	// Array to store books
    private static int bookCount = 0;            	// Counter for the number of books

    // Method to add books
    public static void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Method to remove a book by ISBN
    public static boolean removeBook(int isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn() == isbn) {
                System.out.println("Book removed: " + books[i].getIsbn());
                
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[bookCount - 1] = null;  		// Clear the last slot
                bookCount--;
                return true;  						// Return true if the book was removed
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
        return false;  // Return false if the book wasn't found
    }

    public static void main(String[] args) {
        // Adding books to the library
        Book b1 = new Book("James Gosling", "Java", 1234);
        Book b2 = new Book("Akira Toriyama", "Dragon Balls", 5678);
        Book b3 = new Book("Takehiko Inoue", "Vagabond", 1122);
        Book b4 = new Book("Kentaro Miura", "Berserk", 1123);
        Book b5 = new Book("Mokoto yukimura", "Vinland Saga", 1124);
        Book b6 = new Book("Robert Kiyosaki", "Rich Dad Poor Dad", 1125);
        addBook(b1);
        addBook(b2);
        addBook(b3);
        addBook(b4);
        addBook(b5);
        addBook(b6);

        // Display books before removal
        System.out.println("Books before removal:");
        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();
        b6.display();

        // Try to remove a book by ISBN
        System.out.println("\nRemoving book with ISBN -->");
        boolean isRemoved = removeBook(0);
        if (isRemoved) {
        	System.out.println("Book Removed Sucessfully..!");
        }

        // Display books after removal only if the removal was successful
        if (isRemoved) {
            System.out.println("\nBooks after removal:");
            for (int i = 0; i < bookCount; i++) {
                books[i].display();
            }
        } else {
            System.out.println("Removal failed");
        }
    }
}
