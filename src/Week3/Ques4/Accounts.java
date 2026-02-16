package Week3.Ques4;

/* Implement a program where two separate objects represent two accounts,
and you need to transfer money between them. Use different locks for each account to
ensure thread safety without causing deadlocks.

Objective: Learn how to manage multiple locks and avoid deadlocks in concurrent
systems.
*/
public class Accounts implements Runnable{

	int balance = 5000;
	
	
	@Override
	public void run() {
		deposit(2000);
		withdraw(3000);
		
	}
	
	public void deposit(int amount) {
		
		balance= balance+amount;
	}
	
	public void withdraw(int amount) {
		if(balance>= amount) {
			balance=balance -amount;
		}
	}
	
	public void transfer(Accounts to, Accounts from, int amount) {
		synchronized(from) {
			synchronized(to) {
				
					from.withdraw(amount);
					to.deposit(amount);
					
					System.out.println("Transfer completed, amount transfeerred is: " + amount);
			}
		}
	
	}
}
