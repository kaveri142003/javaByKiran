package ExceptionHandaling;

import java.util.Scanner;
import java.util.*;

public class InputMismatchException {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int b1 ;
		
		try {
			System.out.println("Enter value :");
			b1=sc.nextInt();
			System.out.println(b1);
			
			
		}catch(java.util.InputMismatchException e) {
			System.out.println(e);
		}
	}

}
