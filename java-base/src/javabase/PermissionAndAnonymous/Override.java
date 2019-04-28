package javabase.PermissionAndAnonymous;

public class Override {
	 public static void run() {
		 
	 }
}

class Person {
	public void print() {
		System.out.println("Person");
	}
}

class Student extends Person {
	public void print() {
		System.out.println("student");
	}
}

class Father {
	public Person method() {
		return new Person();
	}
}

class Son extends Father {
	public Student method() {
		return new Student();
	}
}