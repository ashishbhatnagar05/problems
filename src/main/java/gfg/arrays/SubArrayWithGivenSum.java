package gfg.arrays;

import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0
//https://www.geeksforgeeks.org/find-subarray-with-given-sum/
public class SubArrayWithGivenSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int number = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			usingNApproach(n, number, arr);

		}
	}

	private static void usingNApproach(int n, int number, int[] arr) {
		int l = 0, r = 0, sum = 0;
		for (int i = 0; i < n; i++) {
			if (sum > number) {
				sum -= arr[l];
				l++;
			} else if (sum < number) {
				sum += arr[i];
			}
			if (sum == number) {
				r = i;
				break;
			}
		}
		System.out.println((l + 1) + " " + (r + 1));
	}

	private static void usingNsquareApproach(int n, int number, int[] arr) {
		int temp = 0, first = 0, second = 0;
		for (int i = 0; i < n; i++) {
			temp = arr[i];
			for (int j = i + 1; j < n; j++) {
				temp += arr[j];
				if (temp >= number) {
					first = i;
					second = j;
					break;
				}

			}
			if (temp == number) {
				System.out.println((first + 1) + " " + (second + 1));
				break;
			}
		}
	}
}
