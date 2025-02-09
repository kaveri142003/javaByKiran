package Abstraction;

public class CurrentAccount extends BankAccount {
	private static final double OverDraft_limit=100;
	// constructor
	public CurrentAccount(String accountNumber,double balance ,double OverDraft_limit) {
			super(balance , accountNumber);
	       }
			@Override
			public void deposit (double amount) {
				balance += amount;
				System.out.println("deposited "+amount + "in current  account.");
			}
			@Override
			public void withdraw(double amount) {
				if(balance - amount>=-OverDraft_limit) {
					balance -=amount;
					System.out.println("witdraw "+amount+"from current account. ");
				}else {
					System.out.println("overdraft limit extended ! withdrawal not allowed");
				}
			
			
			
			
			
	}
	
	

}
