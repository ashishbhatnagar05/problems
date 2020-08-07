package gfg.arrays;

import java.util.Arrays;

//https://www.geeksforgeeks.org/array-rotation/
public class RotateArrayRightByDElement {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		int d = 3;
		while (d-- > 0) {
			rotateArray(arr);
		}
		Arrays.stream(arr).forEach(System.out::print);
	}

	private static void rotateArray(int[] arr) {
		int n = arr.length;
		int temp = arr[n - 1];
		for (int i = n - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;
	}

}
