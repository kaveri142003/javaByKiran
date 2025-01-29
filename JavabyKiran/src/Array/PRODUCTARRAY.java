package Array;

import java.util.Scanner;

public class PRODUCTARRAY {
	Scanner sc= new Scanner(System.in);
	
public void getPro(int z[]) {
		int pro =1;
		for(int j=0;j<z.length;j++) {
			pro *= z[j];
		}
	System.out.println(pro);
}
    public void getCube(int z[]) {
    	 int cube=1;
    	 for(int i= 0; i<z.length; i++) {
			  cube = z[i]*z[i]*z[i];
	}
    	 System.out.println(cube);
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
