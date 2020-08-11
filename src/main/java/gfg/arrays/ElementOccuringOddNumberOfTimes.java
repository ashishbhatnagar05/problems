package gfg.arrays;
//https://www.geeksforgeeks.org/find-the-number-occurring-odd-number-of-times/
//could also use hashing( O(n)+O(n)=O(n))
public class ElementOccuringOddNumberOfTimes {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 2, 3, 1, 3 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum ^= arr[i];
		}
		System.out.println(sum);
	}
}
