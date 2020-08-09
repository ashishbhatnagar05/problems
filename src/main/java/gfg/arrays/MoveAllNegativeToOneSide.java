package gfg.arrays;

import java.util.Arrays;

//https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/
public class MoveAllNegativeToOneSide {
	public static void main(String[] args) {
		int[] arr = new int[] { -1, -3, 3, -4, 21, 91 };
		algo(arr);
		Arrays.stream(arr).forEach(System.out::print);
	}

	private static void algo(int[] arr) {
		int j = 0, temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				if (i != j) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = arr[j];
				}
				j++;
			}
		}
	}
}
