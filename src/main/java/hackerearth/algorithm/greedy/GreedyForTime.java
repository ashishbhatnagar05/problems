package hackerearth.algorithm.greedy;

import java.util.Arrays;
import java.util.Scanner;

/*https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/tutorial/
 * 
 * */
public class GreedyForTime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] things = new int[n];
		for (int i = 0; i < n; i++) {
			things[i] = sc.nextInt();
		}
		// Arrays.stream(things).forEach(System.out::print);
		int T = sc.nextInt();
		Arrays.sort(things);
		int currentTime = 0, count = 0;
		for (int i = 0; i < n; i++) {
			if (currentTime >= T) {
				break;
			}
			currentTime += things[i];
			count++;

		}
		System.out.println(count);
	}
}
