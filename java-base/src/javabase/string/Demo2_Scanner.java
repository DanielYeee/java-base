package javabase.string;

import java.util.Scanner;

public class Demo2_Scanner {
	public static void run() {
		Scanner sc = new Scanner(System.in);
		/*System.out.print("input the first integer: ");
		int i = sc.nextInt();
		System.out.print("input the second integer: ");
		int j = sc.nextInt();
		System.out.println("i = " + i + "j = " + j);*/
		
		System.out.print("input the first string: ");
		String line1 = sc.nextLine();
		System.out.print("input the second string: ");
		String line2 = sc.nextLine();
		System.out.println("the first string is :" + line1 + "\r\nthe second string is :" + line2);
	}
}
