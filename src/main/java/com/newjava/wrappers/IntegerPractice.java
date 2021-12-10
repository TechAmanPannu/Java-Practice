package com.newjava.wrappers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Amandeep Singh on 12/10/21/12/2021
 */
public class IntegerPractice {

    public static void main(String arg[]) {

        System.out.println("1" + "2");
        System.out.println(new Integer("1") + new Integer("2"));
        System.out.println(Integer.parseInt("1") + Integer.parseInt("2"));
        System.out.println(Arrays.toString(findAllNumbersBySplit("ABC1234XYZ@#$9876")));
        System.out.println(findAllNumbersByPattern("ABC1234XYZ@#$9876"));
//        System.out.println(new Integer("abc")); // NumberFormatException
//        System.out.println(Integer.parseInt("sdf")); // NumberFormatExceptionn
    }

    public static String[] findAllNumbersBySplit(String alphaNumericStr) {
        return  alphaNumericStr.split("([A-Z]+|[@|#|$])");
    }

    public static List<Integer> findAllNumbersByPattern(String alphaNumericStr) {
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher m = pattern.matcher(alphaNumericStr);
        List<Integer> numbers = new ArrayList<>();
        while (m.find()) {
            numbers.add(Integer.parseInt(m.group()));
        }
        return numbers;
    }
}
