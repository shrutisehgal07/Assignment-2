package Week3.Ques3;

/*Write a program to simulate a bank account system where multiple threads
can deposit and withdraw money. Ensure that the balance updates correctly when
multiple transactions happen concurrently.

Objective: Understand how to use the synchronized keyword to avoid race conditions
and ensure thread safety.
*/

public class Trigger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The initial balance is: " + Bank.balance);
		
		Bank bank = new Bank();
		
		Thread t1= new Thread(bank);
		Thread t2 = new Thread(bank);
		Thread t3 = new Thread(bank);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
