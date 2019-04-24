package javabase.inherit_method_final;

public class Demo_Animal {
	public static void run() {
		Cat c1 = new Cat("white ",4);
		System.out.println(c1.getColor() + "..." + c1.getLeg());
		c1.eat();
		c1.catchMouse();
		
		Dog d = new Dog("black",5);
		System.out.println(d.getColor() + "..." + d.getLeg());
		d.eat();
		d.watchDoor();
	}

}
class Animal {
	private String color;
	private int leg;
	
	public Animal() {}
	
	public Animal(String color,int leg) {
		this.color = color;
		this.leg = leg;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}
	
	public void eat() {
		System.out.println("eating");
	}
	
}

class Cat extends Animal {

	public Cat() {}

	public Cat(String color, int leg) {
		super(color, leg);		
	}
	
	public void catchMouse() {
		System.out.println("the cat catch mouse");
	}
	
	public void eat() {
		System.out.println("eat fish");
	}
	

}

class Dog extends Animal {

	public Dog() {
		super();
		
	}

	public Dog(String color, int leg) {
		super(color, leg);
		
	}
	
	public void eat() {
		System.out.println("eat meat");
	}
	
	public void watchDoor() {
		System.out.println("watch the door");
	}
}