package gfg.arrays;

import java.util.Arrays;
import java.util.HashSet;

//https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/
//Now java uses timsort for sorting
public class TwoPairSumX {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 4, 45, 6, 10, -8 };
		int n = arr.length;
		int number = 16;
		// algo
		// twoPointers(arr, n, number);

		hashing(	arr, n, number);
	}

	/**
	 * Time: O(n), Space: O(n)
	 * 
	 * @param arr
	 * @param n
	 * @param number
	 */
	private static void hashing(int[] arr, int n, int number) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			int temp = number - arr[i];
			if (set.contains(temp)) {
				System.out.println("numbers are: " + arr[i] + " " + temp);
			}
			set.add(arr[i]);
		}
	}

	/**
	 * Time if merge sort: O(nlogn), quick sort: O(n^2) Space: merge O(n), quick
	 * sort: O(logn)
	 * 
	 * @param arr
	 * @param n
	 * @param number
	 */
	private static void twoPointers(int[] arr, int n, int number) {
		Arrays.sort(arr);
		int l = 0, r = n - 1, sum = 0;
		while (l != r) {
			sum = arr[l] + arr[r];
			if (sum < number) {
				l++;
			} else if (sum > number) {
				r--;
			} else {
				System.out.println("numbers are : " + arr[l] + " " + arr[r]);
				break;
			}
		}
	}
}
