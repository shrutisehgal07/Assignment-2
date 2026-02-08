package Week2;

/*
  Create a class BankAccount with: -
	• A private variable balance
	• An inner class Transaction that can: -
		o Deposit money
		o Withdraw money
   Demonstrate how the inner class accesses private members of the outer class.
 */

public class BankAccount {
	
	private double balance;
	
	BankAccount(double balance){
		this.balance=balance;
	}
		
		class Transaction{
			
		public void depositMoney(double amount) {
			balance = balance+amount;
			System.out.println("The amount deposited is: "+ amount);
			System.out.println("The current balance is: " + balance);
		}

		public void withdrawMoney(double amount) {
			if(amount>balance) {
				System.out.println("The balance is not sufficient");
			}
			else {
			balance = balance-amount;
			}
			System.out.println("The amount to be withdrawn is: "+ amount);
			System.out.println("The current balance is: " + balance);
		}
	}
		
		public static void main(String[] args) {
			
			BankAccount account = new BankAccount(5000);
			System.out.println("The initial balance is: " + account.balance);
			System.out.println();
			
			BankAccount.Transaction t= account.new Transaction();
			
			t.depositMoney(2000); 
			System.out.println();
			t.withdrawMoney(3000);
		}
		// Since the inner class is inside the class of Bank Account so private are accessible as it is 
		//within the scope of the outer class
}
