package javabase.string;

public class Demo1_StringConstructor {
	public static void run() {
		String s1 = new String();
		System.out.println(s1);//print space
		
		byte[] arr1 = {97,98,99};
		String s2 = new String(arr1);
		System.out.println(s2);//print abc
		
		byte[] arr2 = {97,98,99,100,101,102};
		String s3 = new String(arr2,2,3);
		System.out.println(s3);//print cde
		
		char[] arr3 = {'a','b','c','d','e'};
		String s4 = new String(arr3);
		System.out.println(s4);
		
		String s5 = new String(arr3,1,3);
		System.out.println(s5);//print bcd
		
		String s6 = new String("hello");
		System.out.println(s6);
	}
}
