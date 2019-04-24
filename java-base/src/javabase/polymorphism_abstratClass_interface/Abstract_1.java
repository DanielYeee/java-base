package javabase.polymorphism_abstratClass_interface;

public class Abstract_1 {
	public static void run() {
//		ClippingAnimal ca = new ClippingAnimal();//abstract class cannot be instantiate
		ClippingAnimal ca = new Monkey();
		ca.eat();
	}
	
}

abstract class ClippingAnimal {
	public abstract void eat();
	
	public ClippingAnimal() {
		System.out.println("father's constructor without parameter");
	}
}

class Monkey extends ClippingAnimal {
	public Monkey() {
		super();
	}
	
	public void eat() {
		System.out.println("the monkey is eating banana");
	}
	
}
