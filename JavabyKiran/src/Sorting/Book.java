package Sorting;

import java.util.Scanner;

public class Book {
	
	Scanner sc=new Scanner(System.in);
	public String bookName,bookAuthor;
	public int price,publishYear;
	
	
	public static void sortData(Book b[]) {
		for (int k=0;k<b.length;k++) {
			for(int j=k+1;j<b.length;j++) {
				if (b[k].price>b[j].price) {
					Book t=b[k];
					b[k]=b[j];
					b[j]=t;
				}
			}
		}
	}
	
	public static void acceptvalue(Book b[]) {
		for(int k=0;k<b.length;k++) {
			b[k]=new Book();
			b[k].enterStudentInfo();
		}
	}

public static void displayvalue(Book b[]) {
	for(int k=0;k<b.length;k++) {
		b[k].showStudentInfo();
	}
}
public void enterStudentInfo() {
	System.out.println("Enter book name:");
	bookName =sc.nextLine();
	System.out.println("Enter book author:");
	bookAuthor=sc.nextLine();
	System.out.println("Enter book price :");
	price =sc.nextInt();
	System.out.println("Enter publication year :");
	publishYear=sc.nextInt();
}
public void showStudentInfo() {
	System.out.println("----");
	System.out.println("book name"+bookName);
	System.out.println("book author"+bookAuthor);
	System.out.println("book price"+price);
	System.out.println("publication year"+publishYear);
}

}
