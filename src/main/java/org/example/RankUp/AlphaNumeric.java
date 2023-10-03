package org.example.RankUp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 In this example you have to validate if a user input string is alphanumeric. The given string is not nil/null/NULL/None, so you don't have to check that.

 The string has the following conditions to be alphanumeric:

 At least one character ("" is not valid)
 Allowed characters are uppercase / lowercase latin letters and digits from 0 to 9
 No whitespaces / underscore
 */

public class AlphaNumeric {

    public static boolean alphanumeric(String s){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }

    public static boolean alphanumericBest(String s) {
        return s.matches("[A-Za-z0-9]+");
    }

}
