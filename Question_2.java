package assignment_1;
import java.util.*;
public class Question_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter any number you want to check even or odd");
		int num = s.nextInt();
		
		if (num%2==0) {
			System.out.println("even number");
		}else {
			System.out.println("odd number");
		}
	
}
}
