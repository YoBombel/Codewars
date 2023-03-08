package org.example.Fundamentals;

import java.util.Arrays;
import java.util.stream.Stream;

public class ShortestWord {

    public static int findShort(String s) {
        String[] arr = s.split(" ");
        return Arrays.stream(arr)
                .reduce((s1, s2) -> s1.length() < s2.length() ? s1 : s2)
                .get()
                .length();
    }

    public static int findShortTop(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }

}
