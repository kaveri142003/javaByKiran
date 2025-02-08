package Interfaces;

public class CreditCard implements Payment {
	private String  CardNumber;
	
	
	public CreditCard(String CardNumber) {
		this.CardNumber=CardNumber;
	}
	@Override
	public void  makepayment(double amount){ 
		System.out.println("payment of $ "+amount+"made using  credit card :"+CardNumber );
		
	}
	public void  refund(double amount){ 
		System.out.println("refunds of $ "+amount+"processed to credit card :"+CardNumber );
		
	}
	

}
