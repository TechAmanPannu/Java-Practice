package com.newjava.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Amandeep Singh on 3/15/22/03/2022
 */
public class Sum3 {

    public static void main(String arg[]) {

        int num = 12;
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(findSum(numbers, num));
    }

    public static List<Integer> findSum(List<Integer> numbers, int num) {

        if(numbers.size() < 3) {
            return new ArrayList<>();
        }

        int sum = 0;
        List<Integer> results = new ArrayList<>();
        for (int i = 0 ; i < 3; i++) {
            sum = sum + numbers.get(i);
            results.add(numbers.get(i));
        }

        if(sum == num) {
            return results;
        }
        results = new ArrayList<>();

        for (int i = 1 ; i < numbers.size() ; i ++) {
            sum = sum + numbers.get(i) - numbers.get( i - 1);
            if(sum == num) {

            }
        }
        return null;
    }
}
