package Polymorphism;

public class B extends A {
	String y ="chiku";
	public static void main(String[] args) {
		B k1 = new B();  
		System.out.println(k1.y);
		k1.m1();
	
	}
	public void m1() {
		System.out.println(super.y);
		System.out.println(this.y);
		
	}

}
