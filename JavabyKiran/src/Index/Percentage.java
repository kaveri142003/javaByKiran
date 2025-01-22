package Index;
import java.util.Scanner;
public class Percentage {
	/// calculate percentage;
	public static void main(String[] args) {
		Scanner Scanner = new Scanner (System.in);
		
		System.out.println("Enter total marks :");
		Double totalmarks = Scanner.nextDouble();
		
		System.out.println("Enter obtained marks;");
		Double obtainedmarks= Scanner.nextDouble();
		
		Double percentage =( obtainedmarks /totalmarks)*100;
		System.out.printf("percentage:%2f%%",percentage);
	}

}
