package Abstraction;

public abstract class BankAccount {
	protected double balance ;
	protected  String accountNumber;
	
	// constructor 
	BankAccount (double initialBalance,String accuntNumber){
		this.accountNumber =accountNumber;
		this.balance=initialBalance;
	}
	// abstract method
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	
	// method to display
	public void displayBalance() {
		System.out.println("account number :"+ accountNumber +"| balance :$"+ balance);
	}
	

}
