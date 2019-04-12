package javabase.cycle_and_method;

public class Break {

	public static void main(String[] args) {
		for(int x= 1;x <= 10;x++) {
			if(x == 4)
				break;
			System.out.println("x = " + x);
		}
	}

}
