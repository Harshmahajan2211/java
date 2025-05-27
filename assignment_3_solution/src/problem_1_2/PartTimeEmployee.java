package assignment_3;

public class PartTimeEmployee extends Employee{
	double hourlyrate;
	double hoursworked;
	
    public PartTimeEmployee(int employeeId, String name, String department, double hourlyrate, double hoursworked) {
        super(employeeId, name, department); 
        this.hourlyrate = hourlyrate;
        this.hoursworked = hoursworked;
    }
    public double calculateCompensation() {
        return hourlyrate * hoursworked; 
    }

    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Hourly Rate: " + hourlyrate); 
        System.out.println("Hours Worked: " + hoursworked);
    }
}
