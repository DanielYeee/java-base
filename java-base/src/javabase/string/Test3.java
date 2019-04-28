package javabase.string;

public class Test3 {
	public static void run() {
		String s = "ABCDEabcd123456!@#$%^";
		int upperCase = 0;
		int lowerCase = 0;
		int num = 0;
		int other = 0;
		
		for(int i = 0;i < s.length();i++) {
			char c = s.charAt(i);
			
			if(c >= 'A' && c <= 'Z') {
				upperCase++;
			}else if(c >= 'a' && c <= 'z') {
				lowerCase++;
			}else if(c >= '0' && c <= '9') {
				num++;
			}else {
				other++;
			}
		}
		System.out.println(upperCase );
		System.out.println(lowerCase);
		System.out.println(num);
		System.out.println(other);
	}
}
