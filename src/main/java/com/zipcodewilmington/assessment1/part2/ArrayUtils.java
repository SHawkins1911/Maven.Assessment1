package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
import java.util.*;
import java.util.stream.Stream;
import java.util.Arrays;
import java.io.*;
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int n = objectArray.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(objectArray[i] == objectToCount){
                count++;
            }
        }
        return count;
        }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        Integer [] newArr = null;
        int index = 0;
        for(int i = 0; i < objectArray.length; i++){
            if(objectArray[i] != objectToRemove){
                 objectArray[index++] = objectArray[i];
                }

        }
        return Arrays.copyOf(objectArray, index);
        }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Arrays.sort(objectArray);
        int max = 1;
        int tempCount;
        int temp = 0;
        Object result = objectArray[0];
        int n = objectArray.length;
        for (int i = 0; i <= n-1 ; i++) {
            temp = (Integer)objectArray[i];
            tempCount = 0;
            for (int j = 1; j < n ; j++) {

              if (temp == (Integer)objectArray[j]){
                tempCount++;
            }
              if(tempCount > max){
                    result = temp;
                    max = (Integer)objectArray[i-1];
                }
               }
        }


        return result;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Arrays.sort(objectArray);
        int maxCount = objectArray.length;
        int tempCount = 0;
        int temp = 0;
        Object [] result = new Object [objectArray.length];
        int n = objectArray.length;


        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {

                if (objectArray[j] == objectArray[i]) {
                    tempCount++;
                }
            }
                if (tempCount <= maxCount) {
                    maxCount = tempCount;
                   result[temp++] = (Integer)objectArray[i];
                }
            }

             return result;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Integer [] n = new Integer[objectArray.length + objectArrayToAdd.length];
        System.arraycopy(objectArray, 0, n, 0, objectArray.length);
        System.arraycopy(objectArrayToAdd, 0, n, objectArray.length, objectArrayToAdd.length);
        return n;
    }
}
