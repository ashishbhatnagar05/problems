package gfg.arrays;

import java.util.Arrays;
import java.util.HashSet;

//https://www.geeksforgeeks.org/find-union-and-intersection-of-two-unsorted-arrays/
public class UnionAndIntersectionOfUnsortedArray {
	public static void main(String[] args) {

		int[] arr1 = new int[] { 7, 1, 5, 2, 3, 6 };
		int[] arr2 = new int[] { 3, 8, 6, 20, 7 };

		union(arr1, arr2);
		System.out.println();
		intersection(arr1, arr2);

	}

	private static void intersection(int[] arr1, int[] arr2) {
		HashSet<Integer> hs = new HashSet<>();
		Arrays.stream(arr1).forEach(hs::add);
		Arrays.stream(arr2).filter(e -> hs.contains(e)).forEach(System.out::print);
	}

	private static void union(int[] arr1, int[] arr2) {
		HashSet<Integer> hs = new HashSet<>();
		Arrays.stream(arr1).forEach(hs::add);
		Arrays.stream(arr2).forEach(hs::add);
		hs.stream().forEach(System.out::print);
	}
}
