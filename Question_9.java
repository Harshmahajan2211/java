package assignment_1;
import java.util.*;
public class Question_9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println(" enter any charcter you want to check consonent of vowel");
		char ch= s.next().charAt(0);
		
		if (ch =='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u') {
			System.out.println("enter char is vowel");
		}
		else {
			System.out.println("enter char is consonent");
		}
		
	}
}
