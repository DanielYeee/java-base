package javabase.polymorphism_abstratClass_interface;

public class Interface_Test {
	public static void run() {
		AudiCar audi = new AudiCar("audi A4L","white",100000);
		audi.run();
		HighEndAudi hea = new HighEndAudi("audi A8L","black",20000000);
		hea.run();
		hea.unmanned();
		hea.autoParking();
	}
}

abstract class Car {
	private String brand;
	private String color;
	private int price;
	public Car() {}
	
	public Car(String brand,String color,int price ) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public abstract void run();
}

class AudiCar extends Car {
	public AudiCar() {}
	
	public AudiCar(String brand,String color,int price) {
		super(brand,color,price);
	}
	
	public void run() {
		System.out.println(getColor() + getBrand());
	}
	
}

interface Unmanned {
	public abstract void unmanned();
}

interface AutoParking {
	public abstract void autoParking();
}

class HighEndAudi extends AudiCar implements Unmanned,AutoParking {
	public HighEndAudi() {}
	
	public HighEndAudi(String brand,String color,int price) {
		super(brand,color,price);
	}
	
	public void unmanned() {
		System.out.println("release your hand and foot");
	}
	
	public void autoParking() {
		System.out.println("parking automatically");
	}
}

