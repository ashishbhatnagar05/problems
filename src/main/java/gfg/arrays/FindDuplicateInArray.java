package gfg.arrays;

import java.util.HashSet;

//https://www.geeksforgeeks.org/find-duplicates-in-on-time-and-constant-extra-space/
public class FindDuplicateInArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 1, 3, 6, 6 };
		algo1(arr);
	}

	private static void algo1(int[] arr) {
		HashSet set = new HashSet();
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i])) {
				System.out.print(arr[i]);
			} else {
				set.add(arr[i]);
			}
		}
	}
}
