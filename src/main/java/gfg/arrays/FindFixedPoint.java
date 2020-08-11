package gfg.arrays;

//https://www.geeksforgeeks.org/find-a-fixed-point-in-a-given-array/
public class FindFixedPoint {
	public static void main(String[] args) {
		int[] arr = { -10, -5, 3, 4, 7, 9 };
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == i) {
				index = i;
				break;
			}
		}
		System.out.println(index);
	}
}
