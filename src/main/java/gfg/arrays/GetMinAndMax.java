package gfg.arrays;

import java.util.Arrays;

//https://www.geeksforgeeks.org/program-find-minimum-maximum-element-array/
public class GetMinAndMax {
	public static void main(String[] args) {
		int[] arr = new int[] { 12, 1234, 45, 67, 1 };
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

		getMinMaxIterative(arr, min, max);
		
		//library function
		System.out.println(Arrays.stream(arr).min().getAsInt()+" "+Arrays.stream(arr).max().getAsInt());
		
	}

	private static void getMinMaxIterative(int[] arr, int min, int max) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(min + " " + max);
	}
}
