package problem_5;

public class book_main {
    public static void main(String[] args) {
        // Create an EBook object
        Ebook eBook = new Ebook("Digital Transformation", "John Smith", "978-1234567890", 10.5, "www.example.com/download/digital-transformation");
        System.out.println("EBook Details:");
        eBook.displayBookDetails();
        eBook.checkAvailability();

        System.out.println("\n----------------------------\n");

        // Create a PrintedBook object
        PrintedBook printedBook = new PrintedBook("Learning Java", "Jane Doe", "978-9876543210", 350, "Shelf A3");
        System.out.println("Printed Book Details:");
        printedBook.displayBookDetails();
        printedBook.checkAvailability();
    }
}
