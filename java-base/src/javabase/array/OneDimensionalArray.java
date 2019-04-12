package javabase.array;

public class OneDimensionalArray {

	/**
	 * Exception:ArrayIndecOutOfBoundsException and NullPointerException
	 * @param args
	 * @author DanielYeee
	 * 
	 */
	public static void main(String[] args) {
		int[] arr = {10,20,13,15,25,30};
		
		/*for (int i : arr) {
			System.out.println(i);
		}*/
		
		/*for(int i = 0;i < arr.length;i++) {
			System.out.println(arr[i]);
		}*/
		
		/*int[] newArr = reverseArr(arr);
		for (int i : newArr) {
			System.out.println(i);
		}*/
		
		/*System.out.println(getIndex(arr, 25));*/
		
	}
	
	/*
	 * reverse the array
	 * return an array
	 */
	public static int[] reverseArr(int[] oldArr) {
		int[] newArr = new int[oldArr.length];
		for(int i = 0;i < oldArr.length;i++) {
			newArr[i] = oldArr[oldArr.length - 1 -i];
		}
		return newArr;
		
	}
	
	/*
	 * abtain the max_value of the array
	 */
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1;i < arr.length;i++ ) {			//从数组的第二个元素开始遍历
			if (max < arr[i]) {							//如果max记录的值小于的数组中的元素
				max = arr[i];							//max记录住较大的
			}
		}
		return max;
	}
	
	/*
	 * abtain the index of the number in array
	 */
	public static int getIndex(int[] arr,int value) {
		for (int i = 0;i < arr.length ;i++ ) {				//数组的遍历
			if (arr[i] == value) {							//如果数组中的元素与查找的元素匹配
				return i;
			}

		}
		return -1;
		
	}

}
