package gfg.arrays;

import java.util.Arrays;
import java.util.Comparator;

//https://www.geeksforgeeks.org/given-an-array-of-numbers-arrange-the-numbers-to-form-the-biggest-number/
public class RearrangetoFormBiggestNumber {
	public static void main(String[] args) {

		Integer[] arr = new Integer[] { 54, 546, 548, 60 };
		int n = arr.length;

		Arrays.sort(arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer X, Integer Y) {
				String XY = X + "" + Y;
				String YX = Y + "" + X;
				return XY.compareTo(YX) > 0 ? -1 : 1;
			}
		});
		Arrays.stream(arr).forEach(System.out::print);
	}
}
