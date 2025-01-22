package encapsulation;
import java.util.Scanner;

public class Student {
	
	Scanner sc= new Scanner (System.in);
	private String student_name;
	private String college_name;
	private long student_mobile;
	
	public void studentdetail(){
		System.out.println("Enter student name:");
		 student_name= sc.nextLine();
		
		System.out.println("Enter collage name :");
		college_name= sc.nextLine();
		
		System.out.println("Enter mobile number:");
		student_mobile= sc.nextLong();
		
	}
		public void getDetails (){
			 System.out.println("student Details:");
			 System.out.println("student name:"+student_name);
			 System.out.println(" collage name:"+college_name);
			 System.out.println(" student mobile:"+student_name);
				
				
			 
		}
		
		
	

}
