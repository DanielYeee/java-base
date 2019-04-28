package javabase.PermissionAndAnonymous;

public class LocalInner_Class {
	public static void run() {
		Outer4 o = new Outer4();
		o.method();
		
	}
}

class Outer4 {
	public void method() {
		int num = 10;
		class Inner {
			public void print() {
				System.out.println(num);
			}
		}
		
		Inner i = new Inner(); /*the sequence between class Inner 
								and create Inner object cannot reverse  */
		//local inner class only can be access in method
		i.print();
	}
}