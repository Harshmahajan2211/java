package assignment_3;

public class Truckmain {
	public static void main(String[] args) {
       
        Car car = new Car("Toyota", "Camry", 2018, 4);
        car.displayDetails();  
        System.out.println("Insurance Premium: $" + car.calculateInsurancePremium()); 
        System.out.println();  


        Truck truck = new Truck("Ford", "F-150", 2015, 5);
        truck.displayDetails(); 
        System.out.println("Insurance Premium: $" + truck.calculateInsurancePremium()); 
    }

}
