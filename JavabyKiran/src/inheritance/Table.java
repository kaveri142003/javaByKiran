package inheritance;

import java.util.Scanner;

public class Table extends Furniture {
	
	Scanner sc =new Scanner(System.in);
	
	private String material;
	private int height , width,legs;
	
	// setter
	public void setmaterial(String m) {
		material = m;
	}
	public void setheight(int h) {
		height = h;
	}
	public void setwidth(int w) {
		width = w;
	}
	public void setleg(int l) {
		legs = l;
	}
	// getter
	public String getmaterial() {
		return material;
	}
	public int getheight() {
		return height;
	}
	public int getwidth() {
		return width;
	}
	public int getlegs() {
		return legs;
	}
	public void acceptTableDta() {
		System.out.println();
		System.out.println("--------------");
		System.out.println("Enter Table Data==>");
		System.out.println();
		System.out.println("Enter Table material :");
		setmaterial(sc.next());
		System.out.println("Enter Table height:");
		setheight(sc.nextInt());
		System.out.println("Enter Table width:");
		setwidth(sc.nextInt());
		System.out.println("Enter Table legs:");
		setleg(sc.nextInt());
		
	}
	public void displayTableData() {
		System.out.println();
		System.out.println("------------");
		System.out.println("Table material :"+ getmaterial());
		System.out.println("Enter height:"+getheight());
		System.out.println("Enter width:"+getwidth());
		System.out.println("enter legs :"+ getlegs());
		
	}
	Table(){
		acceptTableDta();
	}
	
}
