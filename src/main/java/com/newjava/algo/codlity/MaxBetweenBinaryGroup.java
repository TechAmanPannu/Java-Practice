package com.newjava.algo.codlity;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MaxBetweenBinaryGroup {

    public static void main(String arg[]) {

        int n = 32;
        System.out.println(getMax(n));
    }

    public static Integer getMax(int n) {
        String binaryString = Integer.toBinaryString(n);
        String[] splits = binaryString.split("1");

        List<String> lists = Arrays.asList(splits);

        if(lists.isEmpty()) {
            return 0;
        }
        boolean inEnd = binaryString.endsWith("1");
        if(!inEnd) {
            lists = lists.subList(0, lists.size() - 1);
        }
        boolean inStart = binaryString.startsWith("1");
        if(!inStart) {
            lists = lists.subList(1, lists.size());
        } else {

            lists = lists.subList(1, lists.size());
        }

        if(lists.isEmpty()) {
            return 0;
        }

       TreeSet set = new TreeSet(lists
               .stream().map(item -> item.length()).collect(Collectors.toSet()));


        return (Integer) set.last();
    }
}
