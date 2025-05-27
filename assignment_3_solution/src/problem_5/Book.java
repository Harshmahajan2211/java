package problem_5;

public class Book {
	    // Common attributes for all types of books
	     String title;
	     String author;
	     String isbn;

	    // Constructor
	    public Book(String title, String author, String isbn) {
	        this.title = title;
	        this.author = author;
	        this.isbn = isbn;
	    }

	    // Getter methods for the attributes
	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public String getIsbn() {
	        return isbn;
	    }

	    // Method to display common book details
	    public void displayBookDetails() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("ISBN: " + isbn);
	    }

	    // Abstract method to check availability (to be implemented by subclasses)
	    public void checkAvailability() {
	    	
	    }
	}

