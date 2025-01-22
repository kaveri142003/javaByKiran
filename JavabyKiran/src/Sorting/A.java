package Sorting;

import java.util.Scanner;

public class A {
	Scanner sc= new Scanner(System.in);
	
	public int getMin (int y[]) {
		int min = y[0];
		for(int k= 0;k<y.length;k++) {
			if(min>y[k]) 
			min =y[k];
		}
		return min;
	}
	
	
	public int getMax (int y[]) {
		int max = y[0];
		for(int k= 0;k<y.length;k++) {
			if(max<y[k]) 
			max =y[k];
		}
		return max;
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
 