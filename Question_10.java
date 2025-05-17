package assignment_1;
import java.util.*;

public class Question_10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int base = 2;
        int exponent = 5;

        int powerResult = power(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is " + powerResult);
		
	}
    public static int power(int base, int exponent) {
        int result = 1;
        int count = 0;

        while (count < exponent) {
            result = result * base;
            count++;
        }
        return result;
    }
}