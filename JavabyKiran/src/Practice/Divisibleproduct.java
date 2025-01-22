package Practice;

public class Divisibleproduct {
	public static void main(String[] args) {
		int pro = 1;
		boolean found= false;
		for (int a=55;a<=103;a++) {
			if (a%2== 0 && a%7==0) {
				pro*=a;
				found=true;
			}
		}
				if(found) {
				System.out.println("product number:"+ pro);
				}else {
					System.out.println("no divisible by both 2 and 7 ");
				}
		}
		
	}


