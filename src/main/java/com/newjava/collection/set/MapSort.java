package com.newjava.collection.set;

import java.util.*;

/**
 * @author Amandeep Singh on 12/10/21/12/2021
 */
public class MapSort {

    public static void main(String arg[]) {

        Map<String, Integer> map = new HashMap();
        map.put("one", 1);
        map.put("three", 3);
        map.put("two", 2);

        List<Map.Entry<String, Integer>> mapList = new ArrayList(map.entrySet());
        mapList.sort((Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) -> {
           return   b.getValue() - a.getValue();
        });
        System.out.println(mapList.get(0));
    }
}
