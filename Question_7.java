package assignment_1;
import java.util.*;

public class Question_7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("programm to check entered year is leap year or not");
		
		System.out.println("enter year yo want to check");
		int year = s.nextInt();
		
		if ((year%4 == 0 && year% 100 !=0) || year % 400==0) {
			System.out.println("enter year is a leap year " +year);
		}
		else {
			System.out.println("enter year is not a leap year " +year);
		}
	}
}
