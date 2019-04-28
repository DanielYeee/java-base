package javabase.string;

public class Demo1_StringMethod {
	public static void run() {
//		demo1();
		demo2();
	}
	
	public static void demo1() {
		String s1 = "one";
		String s2 = "one";
		String s3 = "oNe";
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println("----------");
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
	}
	
	public static void demo2() {
		String s1 = "abc,def";
		String s2 = "bc";
		String s3 = "cb";
		String s4 = "a";
		String s5 = "def";
		
		System.out.println(s1.contains(s2));
		
		System.out.println(s1.contains(s3));
		System.out.println("------------");
		
		System.out.println(s1.startsWith(s4));
		
		System.out.println(s1.startsWith(s5));
		System.out.println("---------------");
		
		System.out.println(s1.endsWith(s4));
		
		System.out.println(s1.endsWith(s5));
		
	}
}
