package gfg.arrays;

import java.util.stream.Stream;

//https://www.geeksforgeeks.org/reverse-a-string-without-affecting-special-characters/
public class ReverseCharArrayWithoutSpecialCharacters {
    public static void main(String[] args) {
        String str = "Ab,c,de!$";
        char[] charArray = str.toCharArray();
        int l = 0, r = charArray.length - 1;
        while (l < r) {
            if (!Character.isAlphabetic(charArray[l])) {
                l++;
            } else if (!Character.isAlphabetic(charArray[r])) {
                r--;
            } else {
                char temp = charArray[l];
                charArray[l] = charArray[r];
                charArray[r] = temp;
                l++;
                r--;
            }
        }
        Stream.of(charArray).forEach(System.out::print);

    }
}
