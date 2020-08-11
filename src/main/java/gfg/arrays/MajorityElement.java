package gfg.arrays;

import java.util.Arrays;

//https://www.geeksforgeeks.org/majority-element/
//could use hashmap too
public class MajorityElement {

	public static void main(String[] args) {
		int arr[] = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };
		int count = 0;
		int element = 0;
		int maj = 0;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (element != arr[i]) {
				element = arr[i];
				count++;
			} else {
				count++;
				if (count >= arr.length) {
					maj = arr[i];
					break;
				}
			}
		}
		if (maj != 0) {
			System.out.println(maj);
		} else {
			System.out.println("No Majority Element");
		}
	}

}
