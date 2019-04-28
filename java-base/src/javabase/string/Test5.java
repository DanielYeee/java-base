package javabase.string;

public class Test5 {
	public static void run() {
		int[] arr = {1,2,3};
		String s = "[";
		
		for(int i = 0;i < arr.length;i++) {
			if(i == arr.length - 1) {//end of the array
				s = s + arr[i] + "]";
			}else {
				s = s + arr[i] + ",";
			}
		}
		System.out.println(s);
	}
}
