package assignment_2;
import java.util.Scanner;
public class Student {
	static Scanner s = new Scanner(System.in);
	int id;
	String name;
	int marks;
	String coursename;
	void findresult() {
		if (marks>50) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
	}
	
	void read() {
		System.out.println("enter student id ");
		id=s.nextInt();
		
		System.out.println("enter student name ");
		name = s.next();
		
		System.out.println("enter marks");
		marks=s.nextInt();
		
		System.out.println("enter course name ");
		coursename=s.next();

	}
	
	void display() {
		System.out.println("student details");
		System.out.println("id :" +id);
		System.out.println("name: "+name);
		System.out.println("marks: "+marks);
		System.out.println("coursename :"+coursename);
	}
	
	public static void main(String[] args) {

		
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		Student s5=new Student();

        System.out.println("Enter details for Student 1:");
        s1.read();
        System.out.println("Enter details for Student 2:");
        s2.read();
        System.out.println("Enter details for Student 3:");
        s3.read();
        System.out.println("Enter details for Student 4:");
        s4.read();
        System.out.println("Enter details for Student 5:");
        s5.read();

        // Display data and results
        System.out.println("\n--- Student 1 ---");
        s1.display();
        s1.findresult();

        System.out.println("\n--- Student 2 ---");
        s2.display();
        s2.findresult();

        System.out.println("\n--- Student 3 ---");
        s3.display();
        s3.findresult();

        System.out.println("\n--- Student 4 ---");
        s4.display();
        s4.findresult();

        System.out.println("\n--- Student 5 ---");
        s5.display();
        s5.findresult();
		
		
	}	
	}



