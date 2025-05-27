package assignment_3;

public class Employee {
	int employeeid;
	String name;
	String department;
	
	public Employee(int employeeid, String name, String department) {
        this.employeeid = employeeid;
        this.name = name;
        this.department = department;		
	}
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeid);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
    public double calculateCompensation() {
        return 0.0;
    }
	

}
