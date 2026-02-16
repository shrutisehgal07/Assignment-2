package Week3.Ques3;

/*Write a program to simulate a bank account system where multiple threads
can deposit and withdraw money. Ensure that the balance updates correctly when
multiple transactions happen concurrently.

Objective: Understand how to use the synchronized keyword to avoid race conditions
and ensure thread safety.
*/

public class Bank implements Runnable{
	
	static int balance= 5000;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		deposit(2000);
		withdraw(3000);
		
	}
	
	private static synchronized void deposit(int amount) {
		
		balance= balance+amount;
		System.out.println("Balance after amount deposited is: " + balance);
	}
	
	private static synchronized void withdraw(int amount) {
		
		if(balance>= amount) {
			balance=balance -amount;
			System.out.println("Balance after amount withdrawal is: " + balance);
		}
		else {
			System.out.println("Insufficient funds");
		}
		
		
	}

}
