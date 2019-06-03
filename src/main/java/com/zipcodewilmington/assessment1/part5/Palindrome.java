package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        StringBuilder result = new StringBuilder();
        String temp = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            result.append(input.charAt(i));
            temp = result.toString();
            if(temp.equals(input)){
                return 1;
            }

        }
        return 0;
    }
}
