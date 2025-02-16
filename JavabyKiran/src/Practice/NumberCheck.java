package Practice;
import java.util.Scanner;
public class NumberCheck {
	public static void main (String []args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter a number");
		double number = scanner.nextDouble();
		
		
		
		if (number >0) {
			System.out.println("the number is positive");
		}else if (number <0){
			System.out.println("the number is negative");
		}else {
			System.out.println("the number is zero");
			
		}
	}
	
	

}
