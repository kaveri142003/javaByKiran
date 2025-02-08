package Interfaces;

public class MainPayment {
	public static void main(String[] args) {
		Payment p = new CreditCard ("1234-5678-9865-6457");
		p.refund(4556);
     	p.makepayment(34665);
		
		
		Payment k = new PhonePay("2346573684");
		k.makepayment(34.32);
		k.refund(45.67);
			
		
	}

}
