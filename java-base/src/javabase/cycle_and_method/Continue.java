package javabase.cycle_and_method;

public class Continue {

	public static void main(String[] args) {
		for(int x = 1;x <= 10;x++) {
			if(x == 4)
				continue;
			System.out.println("x = " + x);
		}
	}

}
