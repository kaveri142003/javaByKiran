package encapsulation;

import java.util.Scanner;

public class Student1 {
	
	Scanner sc= new Scanner (System.in);
	
	private String student_name;
	private String college_name;
	private long student_mobile;
	
	public void setname(String name) {
		student_name = name;
	}	
	public void setcollegename (String college) {
		college_name = college;
	}	
		
	public void setmobile(Long number) {
		 student_mobile = number; 	
	}
	
	//getter
	public String getstudentname() {
		 return student_name ;
		
	}	
	public String getcollegename() {
		return college_name;
	}		
	public Long getmobile() {
		 return student_mobile ;
					   
		
	}
	public void acceptvalue() {
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

