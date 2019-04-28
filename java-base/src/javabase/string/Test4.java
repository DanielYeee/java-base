package javabase.string;

public class Test4 {
	public static void run() {
		String s = "I am Peter";
		String s2 = s.substring(0,1).toUpperCase().
				concat(s.substring(1).toLowerCase());
		System.out.println(s2);
		
	}
}
