package ExceptionHandaling;

public class ExceptionExample {
	public static void main(String[] args) {
		try {
			//code that may throw an exception
			int result = 10 / 2; // this will cause arithmetic exception
			System.out.println("Result :" +result);
		}catch(ArithmeticException e) {
			// handling the exception 
		}finally {
			// this block always execute
			System.out.println("Excution completed");
			
			
		}
	}

}
