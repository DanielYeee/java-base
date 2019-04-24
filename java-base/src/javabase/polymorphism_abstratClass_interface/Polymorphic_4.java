package javabase.polymorphism_abstratClass_interface;

public class Polymorphic_4 {
	public static void run() {
		method(new PetCat());
		System.out.println("---------------");
		method(new PetDog());
		System.out.println("---------------");
		method(new Pet());
	}
	
	public static void method(Pet a) {
		if(a instanceof PetCat) {
			PetCat c = (PetCat)a;
			c.eat();
			c.catchMouse();
		}else if(a instanceof PetDog) {
			PetDog d = (PetDog)a;
			d.eat();
			d.watchDoor();
		}else {
			a.eat();
		}
		
	}
}

class Pet {
	public void eat() {
		System.out.println("the pet is eating");
	}
}

class PetCat extends Pet {
	public void eat() {
		System.out.println("the cat is eating ");
	}
	
	public void catchMouse() {
		System.out.println("the cat is catching mouse");
	}
}

class PetDog extends Pet {
	public void eat() {
		System.out.println("the dog is eating");
	}
	
	public void watchDoor() {
		System.out.println("the dog is watching the door");
	}
}