package javabase.string;

public class Demo2_StringMethod {
	public static void run() {
//		demo1();
//		demo2();
//		demo3();
//		demo4();
//		demo5();
	}

	/**
	 * 
	 */
	private static void demo5() {
		String s = "jsaf";
		s.substring(4);//without accept the substring return from substring method
		System.out.println(s);
	}

	private static void demo4() {
		String s1 = "IamPeter";
		String s2 = s1.substring(5);//obtain all of the leftover character after 5
		System.out.println(s2);
		
		String s3 = s1.substring(0, 5);
		System.out.println(s3);
	}

	private static void demo3() {
		String s1 = "iamPeter";
		int index1 = s1.indexOf("a",3);
		System.out.println(index1);
		
		int index2 = s1.lastIndexOf('e');
		System.out.println(index2);
		
		int index3 = s1.lastIndexOf('e',5);
		System.out.println(index3);
	}

	private static void demo2() {
		String s1 = "one";
		int index = s1.indexOf("e");
		System.out.println(index);
		
		int index2 = s1.indexOf("z");
		System.out.println(index2);//return -1 if the character not exist
		
		int index3 = s1.indexOf("ne");
		System.out.println(index3);
		
		int index4 = s1.indexOf("en");
		System.out.println(index4);//return -1
	}

	private static void demo1() {
		String s1= "one";
		System.out.println(s1.length());
		
		String s2 = "Œ“ «À≠?";
		System.out.println(s2.length());;
		
		char c = s2.charAt(2);
		System.out.println(c);
		
//		char c2 = s2.charAt(10);//StringIndexOutOfBoundsException
//		System.out.println(c2);
	}
}


