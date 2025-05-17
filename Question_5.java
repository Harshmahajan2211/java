package assignment_1;
import java.util.*;

public class Question_5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the number you want to write numbers");
		int n = s.nextInt();
		
		int i =1;
		while (n>=i) {
			System.out.println(i+" ");
			i++;
		}
	}

}
