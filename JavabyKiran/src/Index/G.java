package Index;

public class G {
	public static void main (String[]args) {
		
		int a=144 ,pro=1;
		for (a = 55;a<=342;a++) {
			if(a%3==0 && a%7==0 ) {
				pro=pro*a;
				System.out.println(pro);
			}
		}
	}

}
