package gfg.arrays;

//https://www.geeksforgeeks.org/sum-array-elements-using-recursion/
public class SumOfArrayUsingRecursion {
	public static void main(String[] args) {
		int[] arr = { 15, 12, 13, 10 };

		int sum = sum(arr, arr.length);
		System.out.println(sum);
	}

	private static int sum(int[] arr, int i) {
		if (i <= 0)
			return 0;
		return sum(arr, i - 1) + arr[i - 1];
	}
}
