package ExceptionHandaling;
import java.util.Scanner;
public class LoginException extends Exception {
	private String message null;
	public LoginException() {
		message ="not applicable";
	}
	public LoginException (String message) {
		this.message=message;
		
	}
	public void Showerror() {
		System.out.println("this.message:");
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String UserName="kaveri";
		String Password="4567";
		
		try {
			// code that may throw the exception
			System.out.println("Enter username :");
			UserName =sc.next();
			System.out.println("password :"+Password);
			Password = sc.next();
			
			
			if(UserName == "  ") {
				throw new LoginException("Enter username:");
			}if(Password=="   ") {
				throw new LoginException("Enter Password  :");
			}if( UserName != "kaveri" && Password !="4567") {
				throw new LoginException("Enter usename password correctly") ;
				if (UserName =="kaveri" && Password== "4567") {
					throw new LoginException("login Successfully");
					
				}
			}
				catch(LoginException e) {
					e.Showerror();
				}	
					
				
				}
				
				
			
			
			
			
		}
	}

}
