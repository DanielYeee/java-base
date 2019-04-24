package javabase.inherit_method_final;

public class Demo_Final {
	public static void run() {
		Son1 s = new Son1();
		s.print();
	}
}

/*final class Father {	//this class that decorate by final cannot be extends 
	public void print() {
		System.out.println("access the layout data resource");
	}
}*/

class Son1 /*extends Father*/ {	
	final int NUM = 10;//the variable can be assign only once
	public static final double PI = 3.14;
	public void print() {
//		NUM = 20;// throw an error if try to verify the NUM
		System.out.println(NUM);
	}
}
