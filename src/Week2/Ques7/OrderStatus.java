package Week2.Ques7;
/* Create an enum OrderStatus with values: -
	• PLACED - SHIPPED - DELIVERED - CANCELLED
	• Each enum constant should have a message (example: “Order has been placed”).
	• Add a method inside the enum to return the message.
	• Use the enum in a class and print order status details.
*/


public enum OrderStatus {

	PLACED("Your order has been placed"),
	SHIPPED("Your order has been shipped"),
	DELIVERED("Your order has beeen delievered"),
	CANCELLED("Your order has been cancelled");
	
	private String message;
	
	OrderStatus(String message){
		this.message = message;
	}
	
	public String message() {                      // method to return the message 
		return message;
	}
}


