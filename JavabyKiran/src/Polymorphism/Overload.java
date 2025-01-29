package Polymorphism;

import java.util.Scanner;

import Index.I;

public class Overload {
	public void a (int a) {
		System.out.println("i am ineger method");
			
		}
	public void a(String a) {
		System.out.println("I am string method");
		
	}
				
		/// 	2 different number of parameter
	public void d(char c) {
		System.out.println("I am character value");
	}
	public void d (String s,int i) {
		System.out.println("I am char string value");
	}
	 
	//2 different method having 2 different 
		public void  e (int a,float f) {
			System.out.println("i am int float method");
		}
		public void e(String s,char c) {
			System.out.println(" i am string char method");
		}
		
// method overloading differnt order
		
	public void f(int i,String  s) {
		System.out.println("i am int string method");
		
	}
	public void f(char c,double d) {
		System.out.println("i am char float method");
		
	}
	//overloading differnt access modifiers
	 public void access(int a) {
		 System.out.println("i am access method");
	 }
	protected void access(String s) {
		System.out.println("i am String method");
	}
	//
	public  int b (int b) {
		System.out.println("this method return byte value");
		return b;
	}
	public int b (char c) {
		System.out.println("this method return double value");
		return c;
	}
	// mixture of datatype
	public void h(int k,String s) {
		System.out.println("this method is return mixute of datatype");
	
	}
	public void h(char c ,double d) {
		System.out.println("this method return mixuture char and double datatype");
	}
	//change no. of parameter
	public void g(int a) {
		System.out.println("this method get different datatype");
	}
	public void g (String s,char c) {
		System.out.println("this method get different datatype");
	}
	/// varargs method
	public void k(String...s) {
		for(String i:s) {
			System.out.println(i +" ");
		}
		System.out.println();
	}
	public void k(int...k) {
		for(int i:k) {
			System.out.println(i +" ");
		}
		System.out.println();
	}
	//2 differnt datatype
	public void m(String... s) {
		for(String i:s) {
			System.out.println(i +" ");
		}
		System.out.println();
	}
	public void m(String s , int... k) {
		for(int i:k) {
			System.out.println(i +" ");
		}
		System.out.println();
	}
	///
	public void j(int a, double d) {
		System.out.println("this is int and double method");
	}
	public void j(double a, int d) {
		System.out.println("this is int and double method");
	}

		




}
	