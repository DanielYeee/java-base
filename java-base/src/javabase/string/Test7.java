package javabase.string;

public class Test7 {
	public static void run() {
		String max = "whatever your are black cat or white cat,your are a good cat if you can catch the mouse";
		String min = "cat";
		
		int count = 0;
		int index = 0;
		char i;
		while((index = max.indexOf(min))!= -1 
				&& (i = max.charAt(index +  ))== ' ') {
			count++;
			max = max.substring(index + min.length());
		}
		System.out.println(count);
	
	}
}
