package javabase.class_and_private_and_this;

public class MainMethod {

	public static void main(String[] args) {
//		createCar();
//		createStudent();
//		createPhone();
		new Phone().call();
	}

	/**
	 * 
	 */
	public static void createPhone() {
		Phone p = new Phone();
		p.setBrand("sansung");
		p.setPrice(998);
		
		System.out.println(p);
		p.call();
		p.senMessage();
		p.playGame();
	}

	/**
	 * 
	 */
	public static void createStudent() {
		Student s = new Student("xiaobai",23,"male");
		System.out.println(s);
	}

	/**
	 * 
	 */
	public static void createCar() {
		Car c = new Car();
		c.setColor("red");
		c.setNum(4);
		c.run();
	}

}
