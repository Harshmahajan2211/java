package assignment_3;

public class FullTimeEmployee extends Employee {
	double salary;
	
	public FullTimeEmployee( int employeeid, String name, String department, double salary ) {
		super (employeeid, name, department);
		this.salary= salary;
	}
    public double calculateCompensation() {
        return salary; 
    }
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Salary: " + salary);
	

}
}
