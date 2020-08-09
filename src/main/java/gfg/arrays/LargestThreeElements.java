package gfg.arrays;

//https://www.geeksforgeeks.org/find-the-largest-three-elements-in-an-array/
public class LargestThreeElements {

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 4, 3, 50, 23, 90 };
		int f = Integer.MIN_VALUE;
		int s = Integer.MIN_VALUE;
		int t = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > f) {
				t = s;
				s = f;
				f = arr[i];
			} else if (arr[i] > s) {
				t = s;
				s = arr[i];
			} else if (arr[i] > t) {
				t = arr[i];
			}
		}
		System.out.println(f + " " + s + " " + t);
	}

}
