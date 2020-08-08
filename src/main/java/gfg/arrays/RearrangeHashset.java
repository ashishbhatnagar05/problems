package gfg.arrays;

import java.util.Arrays;
import java.util.HashSet;

//https://www.geeksforgeeks.org/rearrange-array-arri/
public class RearrangeHashset {
	public static void main(String[] args) {
		int[] arr = new int[] { 19, 7, 0, 3, 18, 15, 12, 6, 1, 8, 11, 10, 9, 5, 13, 16, 2, 14, 17, 4 };
		int n = arr.length;
		HashSet set = new HashSet();
		for (int i = 0; i < n; i++) {
			set.add(arr[i]);
		}

		for (int i = 0; i < n; i++) {
			if (!set.contains(i)) {
				arr[i] = -1;
			} else {
				arr[i] = i;
			}
		}
		Arrays.stream(arr).forEach(System.out::print);
	}
}
