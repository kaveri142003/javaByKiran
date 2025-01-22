package Index;

public class H {
	
	public static void main(String[]args) {
		int a = 34, sum=0;
		
		for(a=34;a<=90;a++) {
			if(a%4==0 && a%7==0) {
				sum=sum+a;
				System.out.println(sum);
			}
		}
	}

}
