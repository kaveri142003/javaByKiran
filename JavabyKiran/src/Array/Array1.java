package Array;
import java.util.Scanner;
public class Array1 {
	Scanner sc= new Scanner(System.in);
	
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
	   public void acceptvalue(Byte a[]) {
	    System.out.println("enter number ");
	     for(int k=0;k<a.length;k++) {
	     a[k] = sc.nextByte();
	     }
	}
	
	   public void DisplayValue(Byte a[]) {
		System.out.println("value of byte array");
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}
	   }
	    public void acceptvalue1(long d[]) {
		    System.out.println("enter number ");
		     for(int k=0;k<d.length;k++) {
		     d[k] = sc.nextLong();
		     }
		}
	   public void DisplayValue1(long d[]) {
			System.out.println("value of long array");
			for(int k=0;k<d.length;k++) {
				System.out.println(d[k]);
			}
		   }
	   public void acceptvalue2(double c[]) {
		    System.out.println("enter number ");
		     for(int k=0;k<c.length;k++) {
		     c[k] = sc.nextDouble();
		     }
		}
	   public void DispayValue2(double c[]) {
			System.out.println("value of double array");
			for(int k=0;k<c.length;k++) {
				System.out.println(c[k]);
			}
		   }
	   public void acceptvalue(Long l[]) {
		  for( print k = 0;k<y.length;k++){
			   for(int j= k+1;j<y.length;j++) {
				   if(y[k]>y[j]) {
					   int t = y[k];
					   y[k]=y[j];
					   y[j]=t;
				   }
			   }
		   }
	   }
	   
	   
	   
	
//	public void printEven(long l[]) {
//		System.out.println("Even value from array ->");
//		for (int k=0;k<l.length;k++) {
//			if (l[k]%2==0) {
//				System.out.println(l[k]);
//		}
//	}
//	}
//	public void acceptvalue(long l[]) {
//	    System.out.println("enter byte array ");
//	     for(int k=0;k<l.length;k++) {
//	     l[k] = sc.nextLong();
//	     }
//	}
//	public void DisplayValue(long l[]) {
//		System.out.println("value of byte array");
//		for(int k=0;k<l.length;k++) {
//			System.out.println(l[k]);
//		}
//	   }
//	Scanner
//	public int arraySum(int y[]) {
//		int sum=0;
//		for(int k=0;k<y.length;k++) {
//			sum=sum+y[k];
//		}
//	
//		return sum;
//	}
//		public void Dispalyvalue1(long l[]) {
//		    System.out.println("Long array: ");
//		    for(int k =0 ; k<l.length;k++) {
//		       System.out.println(l[k]);
//		    }
//		}
//		
//		
		
		
		
		
	}
	

	   
