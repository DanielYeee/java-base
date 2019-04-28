package javabase.string;

import java.util.Scanner;

public class Test1 {
	public static void run() {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i < 3;i++) {
			System.out.println("input user name:");
			String userName = sc.nextLine();
			System.out.println("input your password:");
			String password = sc.nextLine();
			if("admin".equals(userName)&&"admin".equals(password)) {
				System.out.println("welcome" + userName + "sign in");
				break;
			}else {
				if(i == 2) {
					System.out.println("you have run out of opportunity,please try again after an hour");
					
				}else {
					System.out.println("wrong input ,you have " + (2 - i) + "times opportunity");
				}
			}
			
		}
	}
}
