package problem_5;

public class PrintedBook extends Book {
    private int pageCount;
    private String shelfLocation;

    // Constructor
    public PrintedBook(String title, String author, String isbn, int pageCount, String shelfLocation) {
        super(title, author, isbn);  // Calling the parent constructor
        this.pageCount = pageCount;
        this.shelfLocation = shelfLocation;
    }

    // Method to display PrintedBook details (Override)
    @Override
    public void displayBookDetails() {
        super.displayBookDetails(); // Call the parent class method
        System.out.println("Page Count: " + pageCount);
        System.out.println("Shelf Location: " + shelfLocation);
    }

    // Implement checkAvailability for PrintedBook
    @Override
    public void checkAvailability() {
        System.out.println("This Printed Book is available on shelf: " + shelfLocation);
    }

    // Getter methods
    public int getPageCount() {
        return pageCount;
    }

    public String getShelfLocation() {
        return shelfLocation;
    }

}
