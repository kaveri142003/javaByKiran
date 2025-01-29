package Array;

public class SumarrayDemo {
	public static void main(String[] args) {
		int y[]= new int[5];
		
		SUMarray bb =new SUMarray();
		bb.acceptvalue(y);
		bb.DisplayValue(y);
		bb.getSum(y);
		int Sum = bb.getSum(y);
		System.out.println("Sum :"+ Sum);
		
	}

}
