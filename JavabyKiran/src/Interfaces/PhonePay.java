package Interfaces;

public class PhonePay implements Payment {
	private  String PhoneNo;
	// constructor
	 public PhonePay (String PhoneNo) {
		 this.PhoneNo=PhoneNo;
	 }
	 @Override
	 public void  makepayment(double amount){ 
			System.out.println("payment of $ "+amount+"made using  credit card :"+PhoneNo );
			
		}
		public void  refund(double amount){ 
			System.out.println("refunds of $ "+amount+"processed to credit card :"+PhoneNo );
			
		}

}
