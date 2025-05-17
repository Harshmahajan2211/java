package assignment_1;
import java.util.*;

public class Question_6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("programm to fin maximum of three number");
		
		System.out.println("enter the first number");
		int num1= s.nextInt();
		
		System.out.println("enter the second number");
		int num2 = s.nextInt();
		
		System.out.println("enter the third number");
		int num3 = s.nextInt();
		
		int max = maximum(num1,num2,num3);
		System.out.println("maximum of three numbers is " + max);
		
	}
	public static int maximum(int num1,int num2,int num3) {
		if (num1>num2 && num1>num3){
			return num1;
		}
		else if (num2>num1 && num2>num3) {
			return num2;
			
		}
		else {
			return num3;
		}
	}
	
}
