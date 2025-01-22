package Sorting;

public class Bookdemo {
	public static void main(String[] args) {
		Book  b []=new Book[3];
		
		Book b1=new Book();
		
		b1.acceptvalue(b);
		b1.displayvalue(b);
		System.out.println();
		System.out.println("sorted data");
		Book.sortData(b);
		b1.displayvalue(b);
	}

}
