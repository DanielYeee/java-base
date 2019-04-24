package javabase.polymorphism_abstratClass_interface;

public class Polymorphic_3 {
	public static void run() {
		Person p = new SuperMan();
		
		System.out.println(p.name);
		p.business();
		SuperMan sm = (SuperMan)p;
		sm.fly();
	}
	
}

class Person {
	String name = "John";
	public void business() {
		System.out.println("business");
	}
	
}

class SuperMan extends Person {
	String name = "SuperMan";
	
	public void business() {
		System.out.println("great business");
	}
	
	public void fly() {
		System.out.println("fly for save people");
	}
}