package ExceptionHandaling;

public class ArrayExample2 {
	public static void main(String[] args) {
		try {
			int [] number = {1 ,2 ,3 ,4 };
			System.out.println(number[2]); // this will throw a ArrayIndexoutOfBoundsException 
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error : Array index out of bunds :");
		} finally {
			System.out.println("Execution is cmpleted");
			
			
			
		}
		
	}

}
