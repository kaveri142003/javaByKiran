package Array;

import java.util.Scanner;

public class SUMarray {
	Scanner sc= new Scanner(System.in);
	public int getSum(int y[]) {
		int sum =0;
		for(int k=0;k<y.length;k++) {
			sum+= y[k];
		}
		return sum;
 		
	}
	
	
	public void acceptvalue(int y[]) {
		System.out.println("enter number");
		for(int k=0;k<y.length;k++) {
			y[k]=sc.nextInt();
		}
	}
	public void DisplayValue(int y[]) {
		System.out.println("value of  int array");
		for(int k=0;k<y.length;k++) {
			System.out.println(y[k]);
		}
		
	}

	

}
