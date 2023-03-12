package com.zipcodewilmington;

import java.util.*;
import java.util.function.IntFunction;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }


    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String a : array) {
            if (a.equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        Collections.reverse(Arrays.asList(array));
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] string = Arrays.copyOf(array, array.length);
        Collections.reverse(Arrays.asList(string));
        return Arrays.equals(string, array);
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String string1 = Arrays.toString(array).toLowerCase();
        char i;
        for (i = 'a'; i <= 'z'; i++) {
            if (string1.indexOf(i) == -1) {//returns false/not there
                return false;
            }
          }
        return true;
    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
       int num = 0;
       for (String string : array) {
           if (string.equals(value)){
               num ++;
           }
       }
        return num;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        for (int i = 0; i < array.length; i ++) {
            if (array[i].equals(valueToRemove)){
                array = StringArrayUtils.removeValue(array , array[i]);
            }
        } return array;     //not passing the test????????????????
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (!Objects.equals(array[i], array[i - 1])) {
                arr.add(array[i]);
            }
        }
        return arr.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> arrL = new ArrayList<>();
        String string = array[0];
        for (int i = 1; i < array.length; i ++){
            if (array[i] == array[i - 1]) {
                string += array[i];
            }
            else {
               arrL.add(string);
               string = array[i];
            }
        }
        arrL.add(string);
        return arrL.toArray(new String[0]);

    }


}
