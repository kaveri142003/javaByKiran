package inheritance;
import java.util.Scanner;
public class Furniture {
	Scanner sc =new Scanner(System.in);
	private String Brand,quality,warranty ;
	
	// setter
	public void setBrand(String b) {
		Brand= b;
	}
	public void setquality(String q) {
		quality= q;
	}
	public void setwarranty(String w) {
		warranty= w;
	}
  /// getter
	public String getBrand() {
		return Brand;
		
	}
	public String getquality() {
		return quality;
		
	}
	public String getwarranty() {
		return warranty;
		
	}
	public void acceptFurniureData() {
		System.out.println("Enter Furniture data;");
		System.out.println();
		System.out.println("Ente brand  name :");
		setBrand(sc.next());
		System.out.println("Enter quality :");
		setquality (sc.next());
		System.out.println("Enter warranty");
		setwarranty (sc.next());
	
	}
	public void displayFurnitureData() {
		System.out.println();
		System.out.println("-------------");
		System.out.println();
		System.out.println("furniture brand  name:"+getBrand());
		System.out.println("furniture quality :"+getquality());
		System.out.println("furniture warranty :"+getwarranty());
	}
	Furniture(){
		acceptFurniureData();
	}
	
	
}
