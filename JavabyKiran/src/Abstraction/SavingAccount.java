package Abstraction;

public class SavingAccount extends BankAccount {
	private static final double min_balance =500;
	//constructor
	public SavingAccount(String accountNumber , double balance,double min_balance) {
			super(balance , accountNumber);
			
				
	}
		@Override
		public void deposit (double amount) {
			if (amount >0) {
				balance+= amount;
				System.out.println("deposited "+amount +"in saving account");
			}
		}
			@Override
			public void withdraw (double amount) {
				if ( balance - amount >= min_balance) {
					balance -=amount;
					System.out.println("withdraw "+amount +"from saving account ");
				}else {
					System.out.println("insufficient balance ! minimum balance of "+ min_balance +"required");
						
					
				}
			
		}
	
	

}
