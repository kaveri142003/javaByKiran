package Sorting;

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee bb []=new Employee[3];
		
		Employee c=new Employee();
		c.acceptdata(bb);
		c.displayvalue(bb);
		System.out.println(" ");
		System.out.println("sorted data");
		Employee.sortdata(bb);
		c.displayvalue(bb);
	}

}

