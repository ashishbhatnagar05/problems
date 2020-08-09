package gfg.arrays;

import java.util.Arrays;

//https://www.geeksforgeeks.org/kth-smallestlargest-element-unsorted-array/
public class KthLargestAndSmallestNumber {
	public static void main(String[] args) {
		int[] arr = new int[] { 12, 3, 5, 7, 19 };
		int k = 5;
		Arrays.sort(arr);
		System.out.println(arr[k - 1] + " " + arr[arr.length - k]);
	}
}
