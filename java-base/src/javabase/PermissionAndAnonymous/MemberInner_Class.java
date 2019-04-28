package javabase.PermissionAndAnonymous;

public class MemberInner_Class {
	public static void run() {
//		Inner i = new Inner();//member inner class cannot instantiate
//		i.method();//cannot invoke its method
		Outer.Inner oi = new Outer().new Inner();
		oi.method();
		
		Outer2.Inner o2i = new Outer2().new Inner();
		o2i.show();
		
	}
}

class Outer {
	private int num = 10;
	/*private class Inner {	//ERROR
		public void method() {
			System.out.println(num);
		}
	}*/
	class Inner {
		public void method() {
			System.out.println(num);
		}
	}
}


class Outer2 {
	public int num = 10;
	class Inner {
		public int num = 20;
		public void show() {
			int num = 30;
			System.out.println(num);//30
			System.out.println(this.num);//20
//			System.out.println(new Outer().num);
			System.out.println(Outer2.this.num);//10
		}
	}
}