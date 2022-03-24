package com.newjava.algo;

import java.util.HashSet;
import java.util.Set;

public class FindSmallestPositiveInteger {

    public static void main(String[] arg) {
        int[] a = {1, 2,3,4,5,7};
        System.out.println(new FindSmallestPositiveInteger().findNumber(a));
    }

    public int findNumber(int[] a) {

        Set<Integer> set = new HashSet();
        int max = 0;
        for (int i : a) {
            if(max < i) {
                max = i;
            }
            set.add(i);
        }


        if(max < 0) {
            return 1;
        }
        for (int i  = 1; i <= max ; i++) {
            if(!set.contains(i)) {
                return i;
            }
        }
        return max + 1;
    }
}
