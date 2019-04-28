package javabase.string;

public class Demo2_String {
	public static void run() {
//		demo1();
//		demo2();
//		demo3();
//		demo4();
//		demo5();
		
	}

	public static void demo5() {
		String s1 = "ab";
		String s2 = "abc";
		String s3 = s1 + "c";//s1 is an object
		System.out.println(s3 == s2);//false
		System.out.println(s3.equals(s2));//true
	}

	public static void demo4() {
		String s1 = "a" + "b" + "c";
		//Becomes "abc" at compile time, assigns "abc" to s, constant optimization mechanism
		String s2 = "abc";
		System.out.println(s1 == s2);//true 
		System.out.println(s1.equals(s2));//true
	}

	public static void demo3() {
		String s1 = new String("abc");//in heap memory
		String s2 = "abc";//in the constant pool
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));//true
	}

	public static void demo2() {
		String s1 = new String("abc");//In heap memory
		System.out.println(s1);
	}

	public static void demo1() {
		String s1 = "abc";//In the constant pool
		String s2 = "abc";
		System.out.println(s1 == s2);//true 
		System.out.println(s1.equals(s2));//true
	}
}
