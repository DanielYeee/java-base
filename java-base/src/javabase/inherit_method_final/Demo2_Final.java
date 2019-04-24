package javabase.inherit_method_final;

public class Demo2_Final {
	public static void run() {
		final int num = 10;
		//num = 20;//num cannot be assign again
		System.out.println(num);
		final Person p = new Person("Peter",23);
//		p = new Person("Harry",16);//p was decorated by final ,cannot be assign again by another object
		p.setName("Harry");
		p.setAge(23);
		System.out.println(p.getName() + ".." + p.getAge());
		
		method(10);
		method(20);
	}
	
	public static void method(final int x) {
//		x += 1;// x cannot be modify
		System.out.println(x);
	}
	
}

class Person {
	private String name;
	private int age;
	
	public Person() {}

	public Person(String name, int age) {
		super();
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
	
	
}