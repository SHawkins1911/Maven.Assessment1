package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
       Integer sum = 0;
        for (int i = 0; i <= n; i++) {
           sum += i;
        }
        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        Integer result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        StringBuilder swapVal = new StringBuilder();
        String num = val.toString();

        for (int i = num.length() - 1; i >= 0; i--) {
            swapVal.append(num.charAt(i));
        }
            num = swapVal.toString();

        return Integer.parseInt(num);
    }
}
