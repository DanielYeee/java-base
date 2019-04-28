package javabase.PermissionAndAnonymous;

public class JudgeConstructor {
	public static void run() {
		Demo d = new Demo();
		d.Demo();
	}
}

class Demo {
	public void Demo() {	//this is a common member method ,isn't a constructor
		System.out.println("this is a common member method");
	}	
	
	public Demo() {	//contructor
		System.out.println("this is a constructor");
	}
}