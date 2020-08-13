package gfg.arrays;

import java.util.Arrays;

//https://www.geeksforgeeks.org/find-a-pair-with-the-given-difference/
public class FindPairWithGivenDifference {
    public static void main(String[] args) {
        int arr[] = {1, 8, 30, 40, 100};
        int d = 60;
        Arrays.sort(arr);
        int l = 0, r = 1;
        boolean flag = false;
        while (l < arr.length && r < arr.length) {
            if (l != r && arr[r] - arr[l] == d) {
                System.out.println(arr[l] + " " + arr[r]);
                flag = true;
                break;
            } else if (arr[r] - arr[l] < d) {
                r++;
            } else {
                l++;
            }
        }
        if (!flag)
            System.out.println("No Pairs");
    }
}
