package assignment;
import java.util.*;

public class problem1 {
	
	void add(double a, double b) {
		
		System.out.println("Result : "+ (a+b));
	}
void sub(double a, double b) {
		
		System.out.println("Result : " + (a-b));
	}
	
void mul(double a, double b) {
		
		System.out.println("Result : " + (a*b));
	}
void div(double a, double b) {
	if(b==0) {
		System.out.println("diveded by zero ");
	}
	else {
		System.out.println("Result : " + (a/b));
	}
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ADD SUB MUL DIV END");
		problem1 oper=new problem1();
		 
		String op= sc.next();
		while (!op.equalsIgnoreCase("end"))
 {
			
			double a=sc.nextDouble();
			double b=sc.nextDouble();
		switch(op.toLowerCase()){
			case("add"):
				oper.add(a, b);
			break;
			case("sub"):
				oper.sub(a, b);
			break;
			case("mul"):
				oper.mul(a, b);
			break;
			case("div"):
				oper.div(a, b);
			break;
			default:
				System.out.println("enter valid input");
				
		}
		
		System.out.println("ADD SUB MUL DIV END");
		op= sc.next();

	}}

}
