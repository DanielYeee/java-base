package javabase.cycle_and_method;

import java.util.ArrayList;

/**
 * For Statement
 * @author DanielYeee
 *@version1.0
 */
public class ForStatement {

	public static void main(String[] args) {
		for(int i = 0;i < 10;i++) {
			System.out.println("Hello World");
		}
		
		for(int i = 10;i > 0;i--) {
			System.out.println("Hello World");
		}
		
		ArrayList<Integer> x = narcissisticNumber();
		System.out.println(x);
	}
	
	/**
	 * Get the narcissistic number between 100-999
	 * the narcissistic number is the cube of each number is equal to the number itself
	 * @return ArrayList<Integer>
	 * 
	 */
	public static ArrayList<Integer> narcissisticNumber() {
		int count = 0;
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 100;i <= 999;i++) {
			int unit = i%10;
			int tens = i/10%10;
			int hundred = i/10/10%10;			
			
			if(unit * unit * unit + tens * tens * tens + hundred * hundred * hundred == i) {
				count++;
				al.add(i);
			}
		}
		System.out.println("the sum of the narcissistic number are:" + count);
		return al;
	}
		

}
