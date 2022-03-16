package com.newjava.algo;

import java.util.HashSet;
import java.util.Set;

public class BulbNSqureComplexity {

    public static void main(String arg[]) {
        int[] A = {1,2,3,4,5};

        //   1, 2, 3, 4, 5  - 5, if every element is in the sorted order then shine count is number of element


        System.out.println(find(A));
    }

    public static int find(int[] n) {

        Set<Integer> store = new HashSet<>();
        int max = -1;
        int mainCount = 0;
        for (int i : n) {
            store.add(i);
            if(max < i) {
                max = i;
            }

            int count = 0;
            for(int j = 1 ; j < max ; j ++) {
                if(store.contains(j)) {
                    count ++;
                }

            }

            if(count == (max - 1)) {
                mainCount ++;
            }
        }

        return mainCount;
    }
}
