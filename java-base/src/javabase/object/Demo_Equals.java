package javabase.object;

public class Demo_Equals {
	public static void run() {
		Student s1 = new Student("Alice",22);
		Student s2 = new Student("Alice",22);
		boolean b = s1.equals(s2);
		System.out.println(s1 == s2);//print false,because the their value of address are different
		System.out.println(b);//print true,the content between two object are equals
	}
}
