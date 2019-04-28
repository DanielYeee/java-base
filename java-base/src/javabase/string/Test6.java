package javabase.string;

import java.util.Scanner;

/**
 * reverse the string input by keyboard
 * @author DanielYeee
 *
 */
public class Test6 {
	public static void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("input a string:");
		String line = sc.nextLine();
		
		char[] arr = line.toCharArray();
		String s = "";
		for(int i = arr.length - 1;i >= 0;i--) {
			s = s + arr[i];
		}
		
		System.out.println(s);
	}
}
