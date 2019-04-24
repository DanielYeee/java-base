package javabase.class_and_private_and_this;

public class Phone {
	private String brand;
	private int price;
	
	
	
	public Phone() {
		super();
		
	}

	public Phone(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

	@Override
	public String toString() {
		
		return brand + "," + price;
	}

	public void call() {
		System.out.println("calling");
	}
	
	public void senMessage() {
		System.out.println("send a message");
	}
	
	public void playGame() {
		System.out.println("play game");
	}
}
