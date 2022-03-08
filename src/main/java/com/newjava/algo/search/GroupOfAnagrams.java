package com.newjava.algo.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Amandeep Singh on 3/8/22/03/2022
 */
public class GroupOfAnagrams {

    public static void main(String arg[]) {

        List<String> list = Arrays.asList("cat", "rat", "tar", "atr", "tap", "pat");
        System.out.println(list.stream().map(element -> String.join("", Arrays.asList(element.split("")).stream().sorted().collect(Collectors.toList()))).collect(Collectors.toSet()).size());
    }
}
