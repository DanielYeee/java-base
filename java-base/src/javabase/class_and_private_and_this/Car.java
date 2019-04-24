package javabase.class_and_private_and_this;

public class Car {
	private String color;
	private int num;
	

	
	public Car() {
		super();
		
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public Car(String color, int num) {
		super();
		this.color = color;
		this.num = num;
	}


	public void run() {
		System.out.println(color + " car with " + num + " tyle is running");
	}
}
