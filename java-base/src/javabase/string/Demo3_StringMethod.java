package javabase.string;

public class Demo3_StringMethod {
	public static void run() {
//		demo1();
//		demo2();
//		demo3();
//		demo4();
	}

	private static void demo4() {
		String s1= "I am";
		String s2 = "Peter";
		String s3 = s1.toLowerCase();
		String s4 = s2.toUpperCase();
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3 + s4);//the + operator is more powerfuls
		System.out.println(s3.concat(s4));
	}

	private static void demo3() {
		char[] arr = {'a','b','c'};
		String s = String.valueOf(arr);
		System.out.println(s);
		
		String s2 = String.valueOf(100);
		System.out.println(s2 + 100);
		
		Person p1 = new Person("Peter",23);
		System.out.println(p1);
		String s3 = String.valueOf(p1);//invoke Person class's toString() method
		System.out.println(s3);
	}

	private static void demo2() {
		String s = "what";
		char[] arr = s.toCharArray();
		
		for (char c : arr) {
			System.out.println(c);
		}
	}

	private static void demo1() {
		String s1 = "abc";
		byte[] arr = s1.getBytes();
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		String s2 = "ÄãºÃ";
		byte[] byte1 = s2.getBytes();
		for (byte b : byte1) {
			System.out.println(b);
		}
	}
}


