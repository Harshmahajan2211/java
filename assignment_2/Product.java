package assignment_2;
import java.util.*;

public class Product {
	static Scanner s = new Scanner(System.in);
	int productid;
	String productname;
	double price;
	
	void read() {
		System.out.println("enter the product id: ");
		productid = s.nextInt();
		
		System.out.println("enter product name: ");
		productname = s.next();
		
		System.out.println("enter product price: ");
		price = s.nextDouble();
		
		
	}
	
	void display() {
		System.out.println("-------new product--------");
		System.out.println("product id :"+productid);
		System.out.println("product name :"+productname);
		System.out.println("price :"+price );
	}
	
	void discount() {
		if (price >1000) {
			System.out.println("10% discounted price is "+price*0.1);
		}
		else {
			System.out.println("5% discounted price is " +price*0.05);
		}
	}
	void totalPrice() {
		double discountedPrice;
	    if (price > 1000) {
	    	discountedPrice = price - (price * 0.10);
	    } else {
	    	discountedPrice = price - (price * 0.05);
	        }
	     System.out.println("Total price to pay after discount: " + discountedPrice);
		

	}
	public static void main(String[] args) {

		
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		Product p4=new Product();
		Product p5=new Product();
		
        System.out.println("Enter details for Product 1:");
        p1.read();
        System.out.println("Enter details for Product 2:");
        p2.read();
        System.out.println("Enter details for Product 3:");
        p3.read();
        System.out.println("Enter details for Product 4:");
        p4.read();
        System.out.println("Enter details for Product 5:");
        p5.read();
        
        p1.display();
        p1.discount();
        p1.totalPrice();
        p2.display();
        p2.discount();
        p2.totalPrice();
        p3.display();
        p3.discount();
        p3.totalPrice();
        p4.display();
        p4.discount();
        p4.totalPrice();
        p5.display();
        p5.discount();
        p5.totalPrice();
		
	}
	

}
