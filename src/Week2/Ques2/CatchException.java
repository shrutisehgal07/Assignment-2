package Week2.Ques2;

/*Create a custom runtime exception called InvalidAgeException.
• Throw this exception if age is less than 18 while creating a User object.
• Catch the exception and print a meaningful error message.
• Demonstrate why this exception is treated as a runtime exception.*/

import java.util.*;
public class CatchException {
	
	String name;
	int age;
	
	public CatchException(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	
	public void checkAge() {
		
		if(age<18) {
			throw new InvalidAgeException(name +" is not of the valid age i.e. less than 18 year.");
		}
		else {
			System.out.println(name + " is of the valid age");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {                     // for an object less than 18 an  exception will be thrown
			CatchException user = new CatchException("Anjali", 17);
			user.checkAge();				
		}
		
		catch(InvalidAgeException iae) {
			System.out.println("An error is encountered: " + iae.getMessage());
		}
		
		System.out.println();
		
		// when the user is greater than 18 so else statement will be printed.
		try {
		CatchException user2 = new CatchException("Simran", 27);            
		user2.checkAge();
		}
		
		catch(InvalidAgeException iae) {           
			System.out.println("An error is encountered: " + iae.getMessage());
		}
		
		//this is a runtime exception because it may occur depending that the condition is met when the program is running.
		
	}

}
