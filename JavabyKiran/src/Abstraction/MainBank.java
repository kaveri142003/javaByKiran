package Abstraction;

public class MainBank {
	public static void main(String[] args) {
		BankAccount saving = new SavingAccount("S12345",1000,3546);
		saving.deposit(500);
		saving.withdraw(1200);
		saving.displayBalance();
		System.out.println();
			
		 BankAccount current= new CurrentAccount("C64563",500 ,3457);
		 current.deposit(1000);
		 current.withdraw(1800);
		 current.displayBalance();
	}

}
