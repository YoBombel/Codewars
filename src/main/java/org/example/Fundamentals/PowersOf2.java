package org.example.Fundamentals;

import static java.util.stream.IntStream.rangeClosed;

public class PowersOf2 {

    /**
     *
     * Complete the function that takes a non-negative integer n as input, and returns a list of all the powers of 2 with the exponent ranging from 0 to n ( inclusive ).
     *
     * n = 0  ==> [1]        # [2^0]
     * n = 1  ==> [1, 2]     # [2^0, 2^1]
     * n = 2  ==> [1, 2, 4]  # [2^0, 2^1, 2^2]
     *
     */

    public static long[] powersOfTwo(int n){
        long[] arr = new long[n+1];

        for(int i = 0; i <= n; i++){
            arr[i] = (long) Math.pow(2, i);
        }

        return arr;
    }

    public static long[] powersOfTwoBitShift(int n) {
        long ret[] = new long[n + 1];
        for (int i = 0; i <= n; i++) ret[i] = 1L << i;
        return ret;
    }

    static long[] powersOfTwoTop(int n) {
        return rangeClosed(0, n).mapToLong(i -> (long) Math.pow(2, i)).toArray();
    }

}
