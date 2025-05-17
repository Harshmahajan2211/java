package assignment_1;
import java.util.Scanner;
public class Question_1 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the first number");
		int num1 = s.nextInt();
		
		System.out.print("enter the second number");
		int num2 = s.nextInt();
		
		int result = addNumbers(num1,num2);
		System.out.println("sum of two number is " + result);
		
	}
	public static int addNumbers(int a, int b) {
		return a+b;
	}
}
