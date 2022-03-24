package com.newjava.string_functions;

import java.util.Arrays;
import java.util.List;

/**
 * @author Amandeep Singh on 12/10/21/12/2021
 */

// https://javapapers.com/java/java-string-vs-stringbuilder-vs-stringbuffer-concatenation-performance-micro-benchmark/
public class StringPractice {

    public static void main (String arg[]) {



        String str = "Hello world";
        System.out.println(reverse(str));
        String[] spaceSplits = splitBySpace(str);
        System.out.println(spaceSplits[0] + " "+ spaceSplits[1] );
        System.out.println(join(spaceSplits, ","));
        System.out.println(replace(str, "world", "##"));
        System.out.println(substring(str, 1));
        System.out.println(substring(str, 1, 4));
        System.out.println(substring(spaceSplits[0].split(""), 1));
    }

    public static String reverse(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

    public static String[] splitBySpace (String str) {
        return str.split(" ");
    }

    public static String replace (String str, String replaceStr, String replaceWith) {
        return str.replace(replaceStr, replaceWith);
    }

    public static String join (String[] strArr, String delimeter) {
        return String.join(delimeter, strArr);
    }

    public static String join (List<String> list, String delimeter) {
        return String.join(delimeter, list);
    }

    public static String substring(String str, int startIndex) {
        return str.substring(startIndex);
    }

    public static String substring(String str, int startIndex, int endIndex) {
        return str.substring(startIndex, endIndex);
    }

    public static String substring(String[] strArr, int startIndex) {
        return String.join("", strArr).substring(startIndex);
    }
}
