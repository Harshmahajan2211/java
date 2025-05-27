package assignment_3;

public class Car extends Vehicle {
	int numberofdoor;
	
	public Car(String make, String model, int year, int numberofdoor) {
		super(make,model,year);
		this.numberofdoor=numberofdoor;
	}
    public double calculateInsurancePremium() {
        double basePremium = 500; 
        int carAge = 2025 - year; 
        return basePremium + (carAge * 20) + (numberofdoor * 30); 
    }

    
    public void displayDetails() {
        super.displayDetails(); // Display common vehicle details
        System.out.println("Number of Doors: " + numberofdoor);
    }

}
