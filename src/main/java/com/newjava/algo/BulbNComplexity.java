package com.newjava.algo;

import java.util.HashSet;
import java.util.Set;

public class BulbNComplexity {

    //https://www.youtube.com/watch?v=2M3WSSyyRLY
    public static void main(String[] arg) {

        int[] A = {4,1,3,5,2};

        //   1, 2, 3, 4, 5  - 5, if every element is in the sorted order then shine count is number of element


        System.out.println(find(A));

    }


        public static int find(int[] n) {
            Set<Integer> notAvailable = new HashSet<>();
            Set<Integer> data = new HashSet<>();
            int count = 0;

            for (int i = 0; i < n.length; i++) {  // every step from 0 to n - 1
                if (i + 1 != n[i] && !data.contains(i + 1)) {

                    System.out.println("===========================");
                    System.out.println("store in missing ; "+(i + 1));
                    notAvailable.add(i + 1);
                }
                if (i + 1 < n[i]) {
                    data.add(n[i]);
                } else {
                    System.out.println("remove from missing ; "+n[i]);
                    notAvailable.remove(n[i]); /// once the bulb gets on nd it is available in not available list it should remove
                }
                if (notAvailable.isEmpty()) {
                    System.out.println("count increased");
                    count++;
                }
                System.out.println("===========================");
            }



            return count;

        }
}

/*

step 0
i = 0;
number of bulbs shining = i + 1 = 1

*/

