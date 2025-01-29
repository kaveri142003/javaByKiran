package inheritance;

import java.util.Scanner;

public class Chair extends Table {
	 
	Scanner sc =new Scanner(System.in);
	private String material;
	private int height , width,legs;
	
	// setter
	public void setmaterialchair(String m) {
		material = m;
	}
	public void setheightchair(int h) {
		height = h;
	}
	public void setwidthchair(int w) {
		width = w;
	}
	public void setlegchair(int l) {
		legs = l;
	}
	// getter
	public String getmaterialchair() {
		return material;
	}
	public int getheightchair() {
		return height;
	}
	public int getwidthchair() {
		return width;
	}
	public int getlegschair() {
		return legs;
	}
	
	public void acceptChairDta() {
		System.out.println();
		System.out.println("--------------");
		System.out.println("Enter chair Data==>");
		System.out.println();
		System.out.println("Enter chair material :");
		setmaterialchair(sc.next());
		System.out.println("Enter chair height:");
		setheightchair(sc.nextInt());
		System.out.println("Enter chair width:");
		setwidthchair(sc.nextInt());
		System.out.println("Enter chair legs:");
		setlegchair(sc.nextInt());
		
	}
	public void displayChairData() {
		System.out.println();
		System.out.println("------------");
		System.out.println("chair material :"+ getmaterialchair());
		System.out.println("chair height:"+getheightchair());
		System.out.println("chair width:"+getwidthchair());
		System.out.println("chair legs :"+ getlegschair());
		
	}
	Chair(){
		 acceptChairDta();
		 displayFurnitureData();
		 displayTableData();
		 displayChairData();
		 
	}
	
	}

