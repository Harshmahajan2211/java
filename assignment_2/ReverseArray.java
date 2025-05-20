package assignment_2;

import java.util.Scanner;

public class ReverseArray {
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
		
		System.out.println("reverse array is ");
		reverse(arr);
	}

	static void reverse(int[] arr) {
		for (int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
	}
	
}
}