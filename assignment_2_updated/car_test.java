package assignment_2_updated;

public class car_test {  
	public static void main(String[] args) {
    // Creating an object of CarRental
    CarRental rental = new CarRental("Toyota Camry", "Alice Johnson", 5, 45.0);

    // Display car and rental details
    rental.displayDetails();

    // Calculate and display total rent
    double total = rental.calculateTotalRent();
    System.out.println("Total Rent: $" + total);
}

}
