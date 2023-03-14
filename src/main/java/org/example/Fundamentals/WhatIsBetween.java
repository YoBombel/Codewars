package org.example.Fundamentals;

import static java.util.stream.IntStream.rangeClosed;

public class WhatIsBetween {

    /*
    Complete the function that takes two integers (a, b, where a < b) and return an array of all integers between the input parameters, including them.

For example:

a = 1
b = 4
--> [1, 2, 3, 4]


     */

    public static int[] between(int a, int b) {

        int[] arr = new int[b-a+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
            a++;
        }
        return arr;
    }

    static int[] betweenTop(int a, int b) {
        return rangeClosed(a, b).toArray();
    }

}
