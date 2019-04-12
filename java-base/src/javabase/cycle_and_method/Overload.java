package javabase.cycle_and_method;

public class Overload {

	public static void main(String[] args) {
		double sum = add(10,20.1);
		System.out.println(sum);
		
		int sum2 = add(10,20,30);
		System.out.println(sum2);
		
		double sum3 = add(12.3,13);
		System.out.println(sum3);
	}
	
	public static double add(int a,double b) {
		return a + b;
	}
	
	public static int add(int a,int b,int c) {
		return a + b + c;
	}
	
	public static double add(double a,int b) {
		return a + b;
	}

}
