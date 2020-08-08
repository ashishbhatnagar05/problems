package gfg.arrays;

import java.util.Arrays;

//https://www.geeksforgeeks.org/move-zeroes-end-array/
public class MoveAllZerosToEndOfArray {
	public static void main(String[] args) {

		int[] arr = new int[] { 0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
		int n = arr.length;
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				arr[count] = arr[i];
				count++;
			}
		}
		while (count < n) {
			arr[count++] = 0;
		}

		Arrays.stream(arr).forEach(System.out::print);
	}
}
