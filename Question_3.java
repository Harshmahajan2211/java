package assignment_1;
import java.util.*;
public class Question_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter your marks to know your grade");
		int marks = s.nextInt();
		
		if (marks >= 90) {
			System.out.println("Grade A");
		}
		else if (marks >=75) {
			System.out.println("Grade B");
		}
		else if (marks >=50) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Grade D");
		}
	}

}
