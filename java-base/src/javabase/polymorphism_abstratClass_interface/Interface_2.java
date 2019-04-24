package javabase.polymorphism_abstratClass_interface;

public class Interface_2 {
	public static void run() {
		Demo2 d2 = new Demo2();
		d2.print();
		
		Inter2 it2 = new Demo2();
		it2.print();
	}
}

interface Inter2 {
	public static final int num = 10;
//	public Inter() {}//interface haven't constructor
	
	/*public void print() {//interface cannot modify unabstract method
	}*/
	
	public abstract void print();
}

class Demo2 implements Inter2 {
	public void print() {
//		num = 20;//final field num cannot be assign
		System.out.println("imply Inter2's abstract method");
	}
	
	public Demo2() {
		super();
		
	}
}