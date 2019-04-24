package javabase.polymorphism_abstratClass_interface;

public class Polymorphic_1 {
	public static void run() {
		Cat c = new Cat();
		c.eat();
		
		Animal a = new Cat();
		a.eat();
	}
}

class Animal {
	public void eat() {
		System.out.println("eating");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("cat eat fish");
	}
}