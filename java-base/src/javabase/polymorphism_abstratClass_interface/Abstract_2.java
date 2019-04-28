package javabase.polymorphism_abstratClass_interface;

public class Abstract_2 {
	public static void run() {
		Interface_Test d = new Interface_Test();
		System.out.println(d.num1 + "..." + d.num2);
		d.method();
	}
}

abstract class Demo {
	int num1 = 10;
//	abstract int num = 20;//abstract cannot decorate member variable
	final int num2 = 20;

	public Demo() {}
	
	public void pirnt() {
		System.out.println("111");
	}
	
	public abstract void method();
}

class Test extends Demo {
	public void method() {
		System.out.println("111");
	}
}