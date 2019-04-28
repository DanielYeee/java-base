package javabase.PermissionAndAnonymous;

public class StaticInner_Class {
	public static void run() {
		Outer3.Inner oi = new Outer3.Inner();
		oi.method();
		
		Outer3.Inner2.print();
	}
}

class Outer3 {
	static class Inner {
		public void method() {
			System.out.println("inner method");
		}
	}
	
	static class Inner2 {
		public static void print() {
			System.out.println("inner2 method");
		}
	}
}