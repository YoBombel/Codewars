package org.example.RankUp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MostFrequentlyUsedWordsInAText {

    /**
     * Write a function that, given a string of text (possibly with punctuation and line-breaks), returns an array of the top-3 most occurring words, in descending order of the number of occurrences.
     * Assumptions:
     * <p>
     * A word is a string of letters (A to Z) optionally containing one or more apostrophes (') in ASCII.
     * Apostrophes can appear at the start, middle or end of a word ('abc, abc', 'abc', ab'c are all valid)
     * Any other characters (e.g. #, \, / , . ...) are not part of a word and should be treated as whitespace.
     * Matches should be case-insensitive, and the words in the result should be lowercased.
     * Ties may be broken arbitrarily.
     * If a text contains fewer than three unique words, then either the top-2 or top-1 words should be returned, or an empty array if a text contains no words.
     */

    public static List<String> top3(String s) {

        String[] tempStringArr = s.toLowerCase().split(" ");
        List<String> sArr = Arrays.stream(tempStringArr).map(str -> str.replaceAll("[^a-z']", " "))
                .map(String::trim)
                .filter(strCheck -> !strCheck.isBlank())
                .filter(str -> str.matches(".*[a-z].*"))
                .toList();

        List<String> top3List = new ArrayList<>(3);
        int[] countArr = {0, 0, 0};
        int temp = 0;

        for (String str : sArr
        ) {
            if (top3List.contains(str)) continue;

            temp = Collections.frequency(sArr, str);

            if (temp > countArr[0]) {
                countArr[0] = temp;
                top3List.add(0, str);
                continue;
            }
            if (temp > countArr[1]) {
                countArr[1] = temp;
                top3List.add(1, str);
                continue;
            }
            if (temp > countArr[2]) {
                countArr[2] = temp;
                top3List.add(2, str);
            }
        }
        while (top3List.size() > 3)
            top3List.remove(3);
        return top3List;
    }

}
