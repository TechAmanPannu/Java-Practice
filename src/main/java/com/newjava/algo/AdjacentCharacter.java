/*
package com.newjava.algo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class AdjacentCharacter {


    public static void main(String arg[]) {

        System.out.println(getString("aabbcc"));
    }

    public static char[] getString(String str) {


        char[] chars = str.toCharArray();
        PriorityQueue frequencies = new PriorityQueue();
        PriorityQueue<Key> pq
                = new PriorityQueue<>(new KeyComparator());
        for (char c = 'a'; c <= 'z'; c++) {
            int val = c - 'a';
            if (count[val] > 0)
                pq.add(new Key(count[val], c));
        }

        char result[] = new char[chars.length];

       for (int i = 0 ; i < chars.length ; i ++) {

           for (Character c : frequencies.keySet()) {
               result[i] = c;
               fre
           }
       }


//        int j = 0;
//        int lastEvenIndex = 0;
//        int lastOddIndex = 1;
//
//        for (Character c : frequencies.keySet()) {
//            boolean isEven = j % 2 == 0;
//            for (int i = 0 ; i < frequencies.get(c) ; i++) {
//
//                if(isEven) {
//                    System.out.println("even index : "+lastEvenIndex);
//                    result[lastEvenIndex] = c;
//                    lastEvenIndex = lastEvenIndex + 2;
//                } else {
//                    System.out.println("odd index : "+lastOddIndex);
//                    result[lastOddIndex] = c;
//                    lastOddIndex = lastOddIndex + 2;
//                }
//            }
//            j++;
//        }
        return result;
    }
}
*/
