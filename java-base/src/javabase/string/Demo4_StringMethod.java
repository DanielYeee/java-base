package javabase.string;

public class Demo4_StringMethod {
	public static void run() {
//		demo1();
//		demo2();
		
	}

	private static void demo2() {
		String s = "  how   ";
		String s1 = s.trim();
		System.out.println(s1);
	}

	private static void demo1() {
		String s = "whatever";
		String s2 = s.replace('e','a');
		System.out.println(s2);
		
		String s3 = s.replace('z', 'o');
		System.out.println(s3);
		
		String s4 = s.replace("what", "who");
		System.out.println(s4);
	}
	
	  
}


