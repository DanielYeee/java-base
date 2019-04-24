package javabase.polymorphism_abstratClass_interface;

public class Polymorphic_Test {
	public static void run() {
		/*A a = new B();
		a.show();//print "am"
		 */		
		
		B b = new C();
		b.show();//print "a donkey"
	}
}

class A {
	public void show() {
		show2();
	}	
	
	public void show2() {
		System.out.println("I");
	}
}

class B extends A {
	public void show() {
		show2();
	}
	
	public void show2() {
		System.out.println("am");
	}
}

class C extends B {
	public void show() {
		super.show();
	}
	
	public void show2() {
		System.out.println("a donkey");
	}
}