package assignment_3;

public class Vehicle {
	String make;
	String model;
	int year;
	
	public Vehicle(String make, String model, int year) {
		this.make=make;
		this.model=model;
		this.year=year;
		
	}
    public void displayDetails() {
        System.out.println("make: " + make);
        System.out.println("model: " + model);
        System.out.println("yesr: " + year);
    }
    public double calculateInsurancePremium() {
        return 0.0;
    }
}
