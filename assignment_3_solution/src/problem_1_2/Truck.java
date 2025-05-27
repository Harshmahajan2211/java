package assignment_3;

public class Truck extends Vehicle{
	int cargocapacity;


    public Truck(String make, String model, int year, int cargocapacity) {
        super(make, model, year); 
        this.cargocapacity = cargocapacity;
    }

    public double calculateInsurancePremium() {
        double basePremium = 800; 
        int truckAge = 2025 - year;
        return basePremium + (truckAge * 50) + (cargocapacity * 100);  
    }


    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Cargo Capacity: " + cargocapacity + " tons");
    }

}
