package problem_5;

public class Ebook extends Book {
    // Attributes specific to EBook
     double fileSize; // in MB
     String downloadLink;

    // Constructor
    public Ebook(String title, String author, String isbn, double fileSize, String downloadLink) {
        super(title, author, isbn);  // Calling the parent constructor
        this.fileSize = fileSize;
        this.downloadLink = downloadLink;
    }

    // Method to display EBook details (Override)
    @Override
    public void displayBookDetails() {
        super.displayBookDetails(); // Call the parent class method
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Download Link: " + downloadLink);
    }

    // Implement checkAvailability for EBook
    @Override
    public void checkAvailability() {
        System.out.println("This EBook is available for download.");
    }

    // Getter methods
    public double getFileSize() {
        return fileSize;
    }

    public String getDownloadLink() {
        return downloadLink;
    }
}
