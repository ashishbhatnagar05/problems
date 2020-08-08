package gfg.arrays;

import java.util.Arrays;
import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/missing-number-in-array/0	
public class MissingNumberInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int[] arr = getArrayInput(n, sc);
			algorithm(n, arr);
		}

	}

	private static int[] getArrayInput(int n, Scanner sc) {
		int[] arr = new int[n - 1];
		for (int i = 0; i < n - 1; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	private static void algorithm(int n, int[] arr) {
		int sum = n * (n + 1) / 2;
		int arr_sum = Arrays.stream(arr).sum();
		System.out.println(sum - arr_sum);
	}
}
