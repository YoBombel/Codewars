package org.example.Fundamentals;

public class ExesAndOhs {

    /**
     * Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
     *
     * Examples input/output:
     *
     * XO("ooxx") => true
     * XO("xooxx") => false
     * XO("ooxXm") => true
     * XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
     * XO("zzoo") => false
     */

    public static boolean getXO (String str) {

        str = str.toLowerCase();
        return str.codePoints().filter(r -> r == 111).count() == str.codePoints().filter(r -> r == 120).count();

        // Good Luck!!

    }

    public static boolean getXOTop (String str) {
        str = str.toLowerCase();
        return str.replace("o","").length() == str.replace("x","").length();

    }

}
