package Sorting;

public class A1 {
public static void main(String[] args) {
	
	int z[]=new int[5];
	
	A ss = new A();
	
	ss.acceptvalue(z);
	ss. DisplayValue(z);

	
	System.out.println();
	System.out.println();
	System.out.println("Max number");
	int max= ss.getMax(z);
	System.out.println("max:"+ max);
	
	System.out.println();
	System.out.println();
	System.out.println("Min number");
	int min = ss.getMin (z);
	System.out.println("min:"+ min);
}
}
