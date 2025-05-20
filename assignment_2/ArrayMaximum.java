package assignment_2;
import java.util.*;
public class ArrayMaximum {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter number of element you want is array");
		int num=s.nextInt();
		
		int[] arr=new  int[num];
		
		for(int i=0; i<num;i++) {
			System.out.println("enter the element "+i);
			arr [i]=s.nextInt();
		}
		System.out.println("array elemnts are: ");
		for (int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		int maxvalue = maximum(arr);
		System.out.println("maximum value of array is :"+maxvalue);
	}
	static int maximum(int[] arr) {
		int max=arr[0];
		for (int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}
