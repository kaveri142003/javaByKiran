package Polymorphism;
import java.util.Scanner;
public class SavingAccount extends Bankaccount {
	Scanner sc = new Scanner(System.in);
	
	
	public void Withdraw () {
		if(balance<100) {
			System.out.println("your balance is under 100-rs,you can't withdraw money");
		}else {
			float withdrawmount=0;
			System.out.println("enter amount to be withdraw :");
			withdrawmount = sc.nextFloat();
			balance-=withdrawmount;
			System.out.println("your withdrawal successful");
			System.out.println("Remaining balance");
			
		}
	}
	

}
