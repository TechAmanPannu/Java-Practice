package com.newjava.algo.search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Amandeep Singh on 2/23/22/02/2022
 */
public class BinarySearch {

    public static void main(String arg[]) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(19);
        numbers.add(199);
        numbers.add(23);
        numbers.add(2);
        numbers.add(1);

        numbers.sort(Comparator.comparing(Integer::intValue));
        System.out.println(numbers);
        System.out.println(binarySearch(numbers, 0, numbers.size() - 1, 19));
    }

    private static boolean binarySearch(List<Integer> numbers,  int start, int end, int k) {


        if(end >= start) {

            int mid = start + (end - start) / 2;
            if (numbers.get(mid) == k) {
                return true;
            }

            if(k < numbers.get(mid) ) {
                return binarySearch(numbers, start, mid - 1, k);
            }
            return binarySearch(numbers, mid + 1, end, k);
        }
        return false;

    }
}
