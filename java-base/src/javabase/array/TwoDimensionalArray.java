package javabase.array;

public class TwoDimensionalArray {
	

	public static void main(String[] args) {
//		valueOfArray();
//		arrayTraversal();
		
	}

	/**
	 * two methods for Array traversal 
	 */
	public static void arrayTraversal() {
		int[][] arr = {{1,2,3},{4,5},{6,7,8,9}};
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Identifying the values of a two-dimensional array
	 */
	public static void valueOfArray() {
		int[][] arr = new int[3][2];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[0][0]);
	}
	
	
	

}
