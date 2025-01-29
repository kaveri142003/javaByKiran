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
	   public void acceptvalue1(Byte a[]) {
	    System.out.println("enter number ");
	     for(int k=0;k<a.length;k++) {
	     a[k] = sc.nextByte();
	     }
	}
	
	   public void DisplayValue1(Byte a[]) {
		System.out.println("value of byte array");
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}
	   }
	    public void acceptvalue2(long d[]) {
		    System.out.println("enter number ");
		     for(int k=0;k<d.length;k++) {
		     d[k] = sc.nextLong();
		     }
		}
	   public void DisplayValue2(long d[]) {
			System.out.println("value of long array");
			for(int k=0;k<d.length;k++) {
				System.out.println(d[k]);
			}
		   }
	   public void acceptvalue3(double c[]) {
		    System.out.println("enter number ");
		     for(int k=0;k<c.length;k++) {
		     c[k] = sc.nextDouble();
		     }
		}
	   public void DispayValue3(double c[]) {
			System.out.println("value of double array");
			for(int k=0;k<c.length;k++) {
				System.out.println(c[k]);
			}
		   }
	   public void acceptString4(String s[]) {
		   System.out.println("enter number") ;
		   for(int k=0;k<s.length;k++) {
			   s[k] = sc.next();
	   }
	   }
	   	public void displayvalue4(String s[]) {
	   		System.out.println("value of string array");
	   		for(int k =0;k<s.length;k++) {
	   			System.out.println(s[k]);
	   		}
	   	}
	   	public void printEvenNoFromArray(int m[]) {
	   		System.out.println("Enter Even no from array :");
	   		for(int k =0;k<m.length;k++) {
	   			if(m[k]%2==0) {
	   				System.out.println(m[k]);
	   			}
	   		}
	   	}
	   	public void acceptvalue5(int m[]) {
			   System.out.println("enter number") ;
			   for(int k=0;k<m.length;k++) {
				   m[k] = sc.nextInt();
		   }
		   }
   	 	public void displayvalue5(int m[]) {
		System.out.println("value of string array");
		for(int k =0;k<m.length;k++) {
			System.out.println(m[k]);
		}
	}
   	 	public void printArraySquare(int n[]) {
   	 		System.out.println("Enter square no from array :");
   	 		for(int k = 0 ; k<n.length;k++) {
   	 			System.out.println(n[k]*n[k]);
   	 		}
   	 	}
   	 	public  void acceptvalue6(int n[]) {
   	 		System.out.println("Enter number:");
   	 		for(int k=0;k<n.length;k++) {
   	 			n[k] =sc.nextInt();
   	 		}
   	 	}
	   public void displayvalue6(int n[]) {
		   System.out.println("value from square from array:");
		   for(int k=0;k<n.length;k++) {
  	 			System.out.println(n[k]);
  	 		}
	   }
	   public void printCubeOfOddElement(int p[]) {
		   System.out.println("cube of odd element");
		   for(int k= 0;k<p.length;k++) {
			   if(p[k]%2!=0) {
				   System.out.println(p[k]*p[k]*p[k]);
			   }
		   }
		   
	   }
	   public  void acceptvalue7(int p[]) {
  	 		System.out.println("Enter number:");
  	 		for(int k=0;k<p.length;k++) {
  	 			p[k] =sc.nextInt();
  	 		}
  	 	}
	   public void displayvalue7(int p[]) {
		   System.out.println("value cube of odd element from array:");
		   for(int k=0;k<p.length;k++) {
 	 			System.out.println(p[k]);
 	 		}
	   }
	   public int printOddElementSum(int q[]) {
		   System.out.println(" odd element sum");
		   int oddsum=0;
		   for(int k= 0;k<q.length;k++) {
			   if(q[k]%2!=0) {
				   oddsum+=q[k];
				   System.out.println("odd element sum:"+ oddsum);
			   }
			   
		   }	
		   return oddsum;
	   }
	   public  void acceptvalue8(int q[]) {
 	 		System.out.println("Enter number:");
 	 		for(int k=0;k<q.length;k++) {
 	 			q[k] =sc.nextInt();
 	 		}
 	 	}
	   public void displayvalue8(int q[]) {
		   System.out.println("value of odd elemet sum:");
		   for(int k=0;k<q.length;k++) {
	 			System.out.println(q[k]);
	 		}
	   }
	   public void printReverseArray (int e[]) {
		   System.out.println("Revrse array:");
		   for (int k=e.length-1 ;k>=0;k--) {
			   System.out.println(e[k]);
		   }
	   }
	   public  void acceptvalue9(int e[]) {
	 		System.out.println("Enter number:");
	 		for(int k=0;k<e.length;k++) {
	 			e[k] =sc.nextInt();
	 		}
	 	}
	   public void displayvalue9(int e[]) {
		   System.out.println("value of odd elemet sum:");
		   for(int k=0;k<e.length;k++) {
	 			System.out.println(e[k]);
	 		}
	   }
	   
}


	
