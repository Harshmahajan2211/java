package assignment_3;

public class main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee(101, "John Doe", "Engineering", 60000);
        fullTimeEmp.displayDetails(); 
        System.out.println("Total Compensation: $" + fullTimeEmp.calculateCompensation());  
        System.out.println(); 

        // Creating part-time employee
        PartTimeEmployee partTimeEmp = new PartTimeEmployee(102, "Jane Smith", "Marketing", 20, 25);
        partTimeEmp.displayDetails();  
        System.out.println("Total Compensation: $" + partTimeEmp.calculateCompensation());  
    }

}
