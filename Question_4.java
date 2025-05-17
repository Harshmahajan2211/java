package assignment_1;
import java.util.*;
public class Question_4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
        System.out.print("Enter first number: ");
        int a = s.nextInt();

        System.out.print("Enter second number: ");
        int b = s.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = s.next().charAt(0);	
        
        double result = calculate(a,b,operator);
        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }
		
	}
	public static double calculate(int a , int b, char operator) {
        switch (operator) {
        case '+':
            return a + b;
        case '-':
            return a - b;
        case '*':
            return a * b;
        case '/':
            if (b != 0)
                return (double) a / b;
            else {
                System.out.println("Error: Division by zero.");
                return Double.NaN;
            }
        default:
            System.out.println("Error: Invalid operator.");
            return Double.NaN ;
	}
}
}