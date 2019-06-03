package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        return str = str.substring(0, 1).toUpperCase() + str.substring(1);


    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return (result.toString());
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        str = (result.toString());

        return str = str.substring(0, 1).toUpperCase() + str.substring(1);
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        String result = str.substring(0, 0) + str.substring(0 + 1);
        str = result.substring(0, result.length() - 1) + result.substring(result.length() - 1 + 1);
        return str;

    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        StringBuilder sb = new StringBuilder();
        for (char letter : str.toCharArray()) {
            if (Character.isUpperCase(letter)){
                letter = Character.toLowerCase(letter);
            } else {
               letter = Character.toUpperCase(letter);
            }
            sb.append(letter);

        }
        return sb.toString();
    }
}
