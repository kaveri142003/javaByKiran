package Array;
import java.util.Scanner;
public class Even {
	Scanner sc = new Scanner (System.in) ;

	public void printEven (long l[]) {
		System.out.println("Even numbers:");
		for (int k=0; k<l.length;k++) {
			if(l[k]%2==0) {
				System.out.println(l[k]);
			}
	}
	}
		public void acceptvalue(long l []) {
		System.out.println("Enter  value");
		for (int k=0; k<l.length;k++) {
			l[k]=sc.nextLong();
		}
			
		}
	
		public void DisplayValue(long l[]) {
		    System.out.println("even value ");
		     for(int k=0;k<l.length;k++) {
		     System.out.println(l[k]);
		     }
		}
		
		public void getSum(long l[]) {
			long sum=0;
			for(int k=0;k<l.length;k++) {
				sum=sum+ l[k];
				
			}
			System.out.println(sum);
		}
		
		public void product(long l[]) {
			long pro=1;
			for(int k=0;k<5;k++) {
				 pro *=l[k] ;
			}
			System.out.println(pro);
		}
		public void Cube(long l[]) {
			long cube= 1;
			for(int k=1; k<l.length;k++) {
				cube =l[k]*l[k]*l[k];
			}
			System.out.println(cube);
		}
		public void Reverse(long l[]) {
			for(int k=l.length-1;k>=0;k--) {
				System.out.println(l[k]);
			}
		}
		public void OddElement(long l[]) {
			long sum=0;
			for(int i=0;i<l.length;i++) {
				if(l[i]%2!=0) {
					sum+=l[i];
				}
			}
			System.out.println(sum);
		}
		
	}


