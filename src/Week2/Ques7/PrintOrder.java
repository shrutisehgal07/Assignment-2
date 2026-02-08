package Week2.Ques7;

import java.util.Scanner;

public class PrintOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to print all the details of the order status together.
/*		for(OrderStatus os : OrderStatus.values()) {
			System.out.println(os +": "+ os.message());
			System.out.println();
		} */
		
		// when the order status needs to printed of a particular choice
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		
		if(str.equalsIgnoreCase("PLACED")) {                         
			System.out.println(OrderStatus.PLACED +": "+ OrderStatus.PLACED.message());
		}
		else if(str.equalsIgnoreCase("SHIPPED")) {
			System.out.println(OrderStatus.SHIPPED +": "+ OrderStatus.SHIPPED.message());
		}
		else if(str.equalsIgnoreCase("DELIVERED")) {
			System.out.println(OrderStatus.DELIVERED +": "+ OrderStatus.DELIVERED.message());
		}
		else if(str.equalsIgnoreCase("CANCELLED")) {
			System.out.println(OrderStatus.CANCELLED +": "+ OrderStatus.CANCELLED.message());
		}
		else {
			System.out.println("Invalid order status");
		}
		
		
		sc.close();
	}

}
