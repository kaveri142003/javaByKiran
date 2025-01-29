package Array;

import java.util.Scanner;

public class twoDimensionalArray {
	Scanner sc= new Scanner(System.in);
	public void getProduct(int a[][], int b[][],int product[][]) {
		int s =0;
		for(int k=0;k<a.length;k++) {
		for(int i=0;i<a[k].length;i++) {
			product [k][i]=0;
			for(int j=0;j<a[i].length;j++) {
				product[k][i]+=a[k][i]*b[k][i];
			}
 }
 }
	}
}