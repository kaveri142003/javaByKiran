package Polymorphism;

import java.util.Scanner;

public class SumOfSingleunit {
	Scanner sc = new Scanner(System.in);
	
	int num;
	public void acceceptvalue() {
		System.out.println("Enter the number:");
		num=sc.nextInt();
	}
	public void addition() {
		
		while (num>=10 ){
			int sum=0;
			while(num>0) {
				sum+=num%10;
			}
			num=sum;
		}
		System.out.println("sum :"+num);
	}	
	public int additionFromTo(int first,int last) {
		int sum =0;
		for(int k=first;k<=last;k++) {
			sum+=k;
		}
		return sum;
	}
	public void enough(int goal) {
		int sum=0;
		int n=0;
		 
		while(sum<goal) {
			n++;
			sum+=n;
		}
		System.out.println(n);
	}
	

}
