package com.newjava.collection.set;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Amandeep Singh on 12/10/21/12/2021
 */
public class ArrayListPractice {

    public static void main(String arg[]) {

        List<Integer> integers  = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        System.out.println(integers);

        // removing by index
        integers.remove(0);

        //adding by index
        integers.add(0, 4);

        System.out.println(integers.subList(0, 1));


        int N =32;
        String[] strs = Integer.toBinaryString(N).split("1");
        List<String> splits = Arrays.asList(strs);
        SortedSet<Integer> set = new TreeSet<>(splits.stream().map(split -> split.length()).collect(Collectors.toSet()));

        System.out.println(set);
    }
}
