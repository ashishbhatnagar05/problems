package gfg.arrays;

import java.util.Arrays;

//https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 4, 5, 1, 2 };
		int n = arr.length;

		int l = 0, r = n - 1, temp = 0;
		while (l < r) {
			temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}

		Arrays.stream(arr).forEach(System.out::print);
	}
}
