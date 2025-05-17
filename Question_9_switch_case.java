package assignment_1;
import java.util.*;

public class Question_9_switch_case {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(" enter any charcter you want to check consonent of vowel");
		char ch= s.next().charAt(0);
		
        switch (ch) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println("Entered char is vowel");
            break;
        default:
            System.out.println("Entered char is consonant");
    }
		
}
}
