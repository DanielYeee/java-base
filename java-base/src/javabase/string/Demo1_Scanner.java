package javabase.string;

import java.util.Scanner;

public class Demo1_Scanner {
	public static void run() {
		Scanner sc = new Scanner(System.in);
		/*int i = sc.nextInt();
		System.out.println(i);*/
		
		if(sc.hasNextInt()) {
			int j = sc.nextInt();
			System.out.println(j);
		}else {
			System.out.println("wrong type");
		}
		sc.close();
	}
}

