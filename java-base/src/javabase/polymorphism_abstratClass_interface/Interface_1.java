package javabase.polymorphism_abstratClass_interface;

public class Interface_1 {
	public static void run() {
//	Inter i = new Inter();//interface cannot be instantiate
		Inter it = new Class();
		it.pirnt();
	}
}

interface Inter {
	public abstract void pirnt();
}

class Class implements Inter {

	@Override
	public void pirnt() {
		System.out.println("print");
	}

		
}
