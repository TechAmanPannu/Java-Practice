package com.newjava.algo.codlity;

import java.util.*;

public class SymmetricStringPoint {

    public static void main(String arg[]) {

//        int[] a = {1, 4, 3, 3, 1, 2};
        String str = " ";
        System.out.println(new SymmetricStringPoint().getStringSymmetricPoint(str));
    }

    public  Integer getStringSymmetricPoint(String str) {

        str = str.trim();
        if(str == null || str.isEmpty()) {
            return -1;
        }


        for(int i = 0 ; i < str.length() ; i++) {

            String s1 = str.substring(0, i);
            String s2 = str.substring(i + 1, str.length());
            if(s1.isEmpty() && s2.isEmpty()) {
                return 0;
            }

            if(s1.length() == s2.length() && s1.equals(new StringBuilder(s2).reverse().toString())) {
                return i;
            }

        }

        return -1;
    }

}
