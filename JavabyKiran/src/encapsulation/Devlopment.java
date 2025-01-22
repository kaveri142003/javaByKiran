package encapsulation;
import java.util.Scanner;

public class Devlopment {
	Scanner sc = new Scanner(System.in);
	private double basic_salary,da,hra,tra,pt,pf;
	private double gross_salary,net_salary;
	
	public void getsalary() {
		System.out.println("Enter basic salary : ");
		basic_salary= sc.nextDouble();
        System.out.println("basic_salary:"+ basic_salary);
	}
	public void calda() {
		da=(basic_salary*8)/100;
		System.out.println("da  8% of + basic_salary " + da) ;
	}
	public void calhra() {
		hra=(basic_salary*4)/100;
		System.out.println("hra  4% of + basic_salary "+ hra) ;
	}
	public void caltra() {
		tra=(basic_salary*5)/100;
		System.out.println("tra  5% of + basic_salary " +tra) ;
	}
	 public void calpt() {
	pt= (basic_salary*3)/100;
	System.out.println("pt  3% of + basic_salary " +pt) ;
	 }
	 public void calpf() {
			pf=(basic_salary *2)/100 ;
			System.out.println("pf  2% of + basic_salary " +pf) ;
		}
	 public void gross_salary() {
		 gross_salary = basic_salary+da+hra+da;
		 System.out.println("gross_salary :" +gross_salary);
	 }
	 public void net_salary() {
		 net_salary = basic_salary-(pt+pf);
		 System.out.println("Net_salary :" + net_salary);
	 }
	 
 }	