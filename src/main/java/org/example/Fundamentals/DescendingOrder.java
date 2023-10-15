package org.example.Fundamentals;

 /*
 Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
Examples:

Input: 42145 Output: 54421
Input: 145263 Output: 654321
Input: 123456789 Output: 987654321

  */

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {

    public static int sortDesc(final int num) {
        char[] arr = String.valueOf(num).toCharArray();
        Arrays.sort(arr);
        String reverse = new StringBuilder(new String(arr)).reverse().toString();
        return Integer.parseInt(reverse);
    }

    public static int sortDescBest(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }

}
