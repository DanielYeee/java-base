package javabase.polymorphism_abstratClass_interface;

public class Polymorphic_2 {
	public static void run() {
		/*Father f = new Son();
		System.out.println(f.num);//print Father's num
		
		Son s = new Son();
		System.out.println(s.num);//print Son's num
		 */	
		
		Father f = new Son();
		f.print();
		f.method();/*Son cannot inherit Father's static method
					this line will print "father's static method" */
		Father.method();
		Son.method();
		}
}

class Father {
	int num = 10;
	public void print() {
		System.out.println("father");
	}
	
	public static void method() {
		System.out.println("father's static method");
	}
}

class Son extends Father {//the Son class override father's two method
	int num = 20;
	
	public void print() {
		System.out.println("son");
	}
	
	public static void method() {//the Son class cannot inherit Father's static method
		System.out.println("son static method");
	}
}
