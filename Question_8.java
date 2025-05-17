package assignment_1;
import java.util.*;
public class Question_8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter number whose table you want");
		int x = s.nextInt();
		int i = 1;
		while (i<= 10) {
		System.out.println(x+" x "+ i +" = "+(x*i));
		i++;
		}
		
	}
}
