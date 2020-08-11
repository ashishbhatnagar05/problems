package gfg.arrays;

import java.util.HashSet;

//https://www.geeksforgeeks.org/find-first-repeating-element-array-integers/
public class FirstRepeatingElement {
	public static void main(String[] args) {
		int arr[] = { 10, 5, 3, 4, 3, 5, 6 };
		HashSet<Integer> set = new HashSet<Integer>();
		int min = -1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (set.contains(arr[i])) {
				min = i;
			} else {
				set.add(arr[i]);
			}
		}
		if (min != -1) {
			System.out.println(arr[min]);
		} else {
			System.out.println("No repeating elements");
		}
	}
}
