package javabase.inherit_method_final;

public class Demo {
	public static void run() {
		Son s = new Son();
		System.out.println(s.getName() + "..." + s.getAge());
		System.out.println("-------------");
		Son s2 = new Son("Peter",23);
		System.out.println(s2.getName() + "..." + s2.getAge());
	}
}

class Father {
	private String name;
	private int age;
	
	public Father() {
		System.out.println("father's null parameter constructor");
	}
	
	public Father(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("father's constructor with parameter");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class Son extends Father {
	public Son() {
		this("Peter",25);//invoking self-class constructor
	}

	public Son(String name,int age) {
		//super(name,age);//compiler will add this paragraph automatically
		System.out.println("son's constructor with parameter");
	}
}