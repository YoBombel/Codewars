package org.example.Fundamentals;

public class BreakCamelCase {

    public static String camelCase(String input) {

        char[] charArr = input.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < charArr.length; i++) {
            if (Character.isUpperCase(charArr[i]))
                stringBuilder.append(" ");
            stringBuilder.append(charArr[i]);
        }
        return stringBuilder.toString();
    }

    public static String camelCaseTop(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }

}
