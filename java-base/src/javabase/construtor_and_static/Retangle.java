package javabase.construtor_and_static;

public class Retangle {
	private int width;
	private int height;
	
	public Retangle() {}

	public Retangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getLength() {
		return 2 * (width + height);
	}
	
	public int getArea() {
		return width * height;
	}
}
