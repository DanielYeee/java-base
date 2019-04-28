package javabase.object;

public class Demo2_Object {
	public static void run() {
		Student s = new Student("Peter",23);
		Class<? extends Student> getClass = s.getClass();
		String name = getClass.getName();
		System.out.println(name);
	}
}
