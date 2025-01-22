package Sorting;

import java.util.Scanner;

public class Bubble {
	Scanner sc= new Scanner(System.in);
	
	
	public void bubblesortAsending(int i[]) {
		for(int k = 0;k<i.length;k++) {
			for(int j =k+1;j<i.length;j++) {
				if (i[k]>i[j]){
					int t = i[k];
					i[k]=i[j];
					i[j]=t;
				}
				
			}
		}
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
