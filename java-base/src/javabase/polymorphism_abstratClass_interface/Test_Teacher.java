package javabase.polymorphism_abstratClass_interface;

public class Test_Teacher {
	public static void run() {
		EnglishTeacher et = new EnglishTeacher("Peter",32);
		et.teach();
	}
}

abstract class Teacher {
	private String name;
	private int age;
	
	public Teacher() {}
	
	public Teacher(String name,int age) {
		this.name = name;
		this.age = age;
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
	
	public abstract void teach();
}

class EnglishTeacher extends Teacher{
	public EnglishTeacher() {}
	
	public EnglishTeacher(String name,int age) {
		super(name,age);
	}
	
	public void teach() {
		System.out.println("teaching English");
	}
}