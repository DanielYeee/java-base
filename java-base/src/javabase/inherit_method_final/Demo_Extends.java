package javabase.inherit_method_final;

public class Demo_Extends {
	public static void run() {
		Zi z = new Zi();
		z.show();
	}
}

class Fu{
	public int num = 10;
	public Fu(){
		System.out.println("fu");
	}
}
class Zi extends Fu{
	private int num = 20;
	public Zi(){
		//super();
		System.out.println("zi");
	}
	public void show(){
		int num = 30;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
}
