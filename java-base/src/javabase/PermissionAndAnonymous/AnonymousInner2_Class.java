package javabase.PermissionAndAnonymous;

public class AnonymousInner2_Class {
	public static void run() {
		Outer6 o6 = new Outer6();
		o6.method();
	}
}

interface Inter2 {
	public void show();
	public void show2();
}

class Outer6 {
	public void method() {
		/*new Inter2() {	//create an anonymous inner class
			public void show() {
				System.out.println("show1");
			}
			
			public void show2() {
				System.out.println("show2");
			}
			
		}.show();
		
		new Inter2() {
			public void show() {
				System.out.println("show1");
			}
			
			public void show2() {
				System.out.println("show2");
			}
		}.show2();*/
		
		Inter2 i = new Inter2() {
			public void show() {
				System.out.println("show1");
			}
			
			public void show2() {
				System.out.println("show2");
			}
			
			/*public void show3() {	//method new create in anonymous inner class never use locally
				System.out.println("show3");
			}*/
		};
		
		i.show();
		i.show2();
//		i.show3();//anonymous inner class haven't sub_class ,cannot transfer downward
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
}