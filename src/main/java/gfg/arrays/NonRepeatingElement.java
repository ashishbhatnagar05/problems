package gfg.arrays;

import java.util.HashMap;
import java.util.Map;

//https://www.geeksforgeeks.org/non-repeating-element/
public class NonRepeatingElement {
	public static void main(String[] args) {
		int arr[] = { 9, 4, 9, 6, 7, 4 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		map.entrySet().stream().filter(x -> x.getValue() == 1).forEach(x -> System.out.println(x.getKey()));
	}
}
