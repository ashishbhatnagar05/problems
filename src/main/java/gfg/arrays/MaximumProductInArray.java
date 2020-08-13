package gfg.arrays;
//https://www.geeksforgeeks.org/return-a-pair-with-maximum-product-in-array-of-integers/
public class MaximumProductInArray {
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 6, 7, 0};
        int posa = 0, posb = 0;
        int nega = 0, negb = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > posa) {
                posb = posa;
                posa = arr[i];
            } else if (arr[i] > posb) {
                posb = arr[i];
            }

            if (arr[i] < 0 && Math.abs(arr[i]) > Math.abs(nega)) {
                negb = nega;
                nega = arr[i];
            } else if (arr[i] < 0 && Math.abs(arr[i]) > Math.abs(negb)) {
                negb = arr[i];
            }
        }

        if (Math.abs(nega * negb) > posa * posb) {
            System.out.println(nega + " " + negb);
        } else {
            System.out.println(posa + " " + posb);
        }
    }

}
