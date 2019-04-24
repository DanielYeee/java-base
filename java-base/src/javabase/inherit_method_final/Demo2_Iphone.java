package javabase.inherit_method_final;

public class Demo2_Iphone {
	public static void run() {
		Ios8 i = new Ios8();
		i.siri();
		i.call();
	}
}

class Ios7 {
	public void call() {
		System.out.println("calling");
	}
	
	public void siri() {
		System.out.println("speak English");
	}
	
}

class Ios8 extends Ios7 {
	public void siri() {
		System.out.println("speak Chinese");
		super.siri();
	}
}