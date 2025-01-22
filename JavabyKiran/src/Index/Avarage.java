package Index;
import java.util.Scanner;
public class Avarage {
	// average of 3 number;
	public static void main(String[] args) {
		Scanner Scanner = new Scanner (System.in);
		 
		System.out.println("Enter first no:");
		Long num1 = Scanner.nextLong();
		
		System.out.println("Enter second no:");
		Long num2 = Scanner.nextLong();
		 
		System.out.println("Enter third no:");
		Long num3 =  Scanner.nextLong();
		
		Long avarage=(num1 + num2+ num3) /3;
		System.out.println("The avarage of three no ;" + avarage);

	}

}
