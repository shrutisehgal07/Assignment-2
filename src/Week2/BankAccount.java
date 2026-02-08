package Week2;

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

}
