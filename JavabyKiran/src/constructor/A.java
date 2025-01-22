package constructor;
import java.util.Scanner;

public class A {
     
	String book_name;
	String book_author;
	Long book_price;
	Long book_quantity;
	
	public A() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter book name:");
		book_name= sc.nextLine();
		
		
		System.out.println("Enter book author:");
		book_author= sc.nextLine();

		System.out.println("Enter book price:");
		book_price= sc.nextLong();
		
		System.out.println("Enter book quantity:");
		book_quantity= sc.nextLong();
	}
		public void display() {
		System.out.println("book_name:"+ book_name);
		System.out.println("author_name:"+ book_author);
		System.out.println("book_price:"+ book_price);
		System.out.println("book_quantity:"+ book_quantity);


	}
	
	
	
}
