package javabase.polymorphism_abstratClass_interface;

public class Interface_3 {
	public static void run() {
		MultiImply mi = new MultiImply();
		mi.printA();
		mi.printB();
	}
}

interface InterA {
	public abstract void printA();
}

interface InterB {
	public abstract void printB();
}

/*class MultiImply implements InterA,implements InterB {
 * //the conduction is illegal
}*/
class MultiImply implements InterA,InterB {//a class can imply several interface 
	public void printA() {
		System.out.println("A");
	}
	
	public void printB() {
		System.out.println("B");
	}
}
