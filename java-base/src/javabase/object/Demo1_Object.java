package javabase.object;

public class Demo1_Object {
	public static void run() {
		Object object = new Object();
		int hashCode = object.hashCode();
		System.out.println(hashCode);
		
		Student s1 = new Student("Peter",23);
		Student s2 = new Student("Alice",24);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}

class Student {
	private String name;
	private int age;
	
	public Student() {}
	public Student(String name,int age) {
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
	@Override
	public String toString() {
		
		return "my name is : " + this.getName() + ",my age is :" + this.getAge();
	}
	@Override
	public boolean equals(Object obj) {
		Student s = (Student)obj;
		return this.getName().equals(s.getName()) && this.age == s.age ;
	}
	
	
	
}

