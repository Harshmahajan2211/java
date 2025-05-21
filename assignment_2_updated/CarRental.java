package assignment_2_updated;
//import java.util.*;

public class CarRental {

		String carModel;
		String customerName;
		int rentalDays;
		double ratePerDay;
		
	
	public CarRental(String carModel,String customerName,int rentalDays,double ratePerDay) {

		
		this.carModel = carModel;
        this.customerName = customerName;
        this.rentalDays = rentalDays;
        this.ratePerDay = ratePerDay;
	}
	void displayDetails() {
		System.out.println("----- the car details----- ");
        System.out.println("----- Rental Details -----");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Rate per Day: $" + ratePerDay);
	}

    public double calculateTotalRent() {
        return rentalDays * ratePerDay;
    }
 // Main.java

}


