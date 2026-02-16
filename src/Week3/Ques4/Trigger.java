package Week3.Ques4;

/*Implement a program where two separate objects represent two accounts,
and you need to transfer money between them. Use different locks for each account to
ensure thread safety without causing deadlocks.

Objective: Learn how to manage multiple locks and avoid deadlocks in concurrent
systems.
*/
public class Trigger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Accounts account1 = new Accounts();       // object 1
		Accounts account2 = new Accounts();       // object 2
		
		Thread acc1 = new Thread(()-> account1.transfer(account1, account2 ,3500));
		Thread acc2 = new Thread(() -> account2.transfer(account2, account1 ,5000));
		
		acc1.start();
		acc2.start();
	}

}
