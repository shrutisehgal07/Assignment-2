package Week2;

/* Write a Java program that:-
• Takes two integers from the user.
• Performs division of the first number by the second.
• Handles the following exceptions: -
	o ArithmeticException (division by zero)
	o InputMismatchException (non-integer input) -
	o Uses multiple catch blocks and a finally block to print: “Program execution
		completed”.*/

import java.util.*;
public class Ques1 {
		
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
			
		System.out.println("Enter the values of num1 and num2");
			
			
		try{
			int num1= sc.nextInt();
			int num2= sc.nextInt();
				
			int div= num1/num2;                      
				
		}
		catch(ArithmeticException e) {          //ex: 5/0
			System.out.println("An arithmetic exception has occured.");
		}
		catch(InputMismatchException e) {          //ex: a/5
			System.out.println("An input mismatch exception has occured.");
		}
		catch(Exception e) {                           //for any other exception except the above
			System.out.println("An exception has occured.");
		}
			
		finally {
			System.out.println("Program execution completed.");
		}
		
	}


}
