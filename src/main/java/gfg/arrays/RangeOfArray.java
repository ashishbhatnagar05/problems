package gfg.arrays;

import java.util.Arrays;

//https://www.geeksforgeeks.org/range-and-coefficient-of-range-of-array/
public class RangeOfArray {
	public static void main(String[] args) {

		int[] arr = new int[] { 5, 10, 15 };
		int min = Arrays.stream(arr).min().getAsInt();
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println("range: " + (max - min));
	}
}
