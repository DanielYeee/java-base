package javabase.cycle_and_method;

public class Mark {

	public static void main(String[] args) {
		outer:for(int i = 1;i <= 10;i++) {
			System.out.println("i = " + i);
			inner:for(int j = 1;j <= 10;j++) {
				System.out.println("j = " + j);
				break inner;
//				break outer;
			}
		}
	}

}
