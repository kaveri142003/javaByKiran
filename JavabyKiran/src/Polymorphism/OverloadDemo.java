package Polymorphism;

public class OverloadDemo {
public static void main(String[] args) {
	Overload b =  new Overload();
	b.a(5);
	b.a("chetan");
	
	b.d('A');
	b.d("vaishnavi", 5);
	
	b.e(3,49);
	b.e("kaveri", 'a');
	
	b.f(7, "nishchal");
	b.f('c', 0.78);
	
	b.access(4);
	b.access("Rushikesh");
	
	b.b(1);
	b.b('g');
	
	b.h(3, "vaibhav");
	b.h('c', 22.4);
	
	
	b.m ("vaishnavi","abc");
	b.m("nish", 5 , 7);
	
	b.g(5);
	b.g("Rinks", 'c');
	
	b.k("rushi");
	b.k(5);
	
	b.j(5,55.8);
	b.j(55,(double)6);
	b.j((double)6,6);
	
	
}
}
