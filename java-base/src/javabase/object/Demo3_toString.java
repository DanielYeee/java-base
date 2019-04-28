package javabase.object;

public class Demo3_toString {

	public static void run() {
		Student s = new Student("Peter",25);
		String str = s.toString();
		System.out.println(str);
		System.out.println(s.toString());
		System.out.println(s);
	}
	
}
