package javabase.PermissionAndAnonymous;

public class AnonymousInner_Class {
	public static void run() {
		Outer5 o = new Outer5();
		o.method();
	}
}

interface Inter {
	public void print();
}

class Outer5 {
	class Inner implements Inter {
		public void print() {
			System.out.println("print");
		}
	}
	
	public void method() {
//		Inner i = new Inner();
//		i.print();
//		new Inner().print(); 
//		Inter j = new Inner();
//		j.print();
		
		new Inter() {
			public void print() {
				System.out.println("print");
			}
		}.print();
	}
}
