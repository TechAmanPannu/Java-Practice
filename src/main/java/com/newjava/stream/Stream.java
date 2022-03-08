package com.newjava.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String arg[]) {

        // filter, map, limit, reduce, find, match, and so on
        List<Integer> list = Arrays.asList(10, 2, 8, 20, 1, 3);
        List<Integer> secondList = Arrays.asList(1,3,5,6,7);

       list =  list.stream().filter(i -> i != 2).collect(Collectors.toList());
        System.out.println("filtering : "+list.toString());


      list =   list.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println("map: "+list.toString());

        System.out.println(list.stream().limit(3).findFirst().orElse(1));
        System.out.println("limit: "+list.toString());


        System.out.println(list.stream().collect(Collectors.toList()));

        /// flatmap
        List<List<Integer>> multiList = new ArrayList<>();
        multiList.add(list);
        multiList.add(secondList);
       List<Integer> integers = multiList.stream().flatMap(integerList -> integerList.stream()).collect(Collectors.toList());
        System.out.println(integers);

        /// reduce
        System.out.println(list.stream().reduce( 0 , (a, b) -> a + b));

        /// find frequency of number with reduce

        Map<Integer, Integer> frequency = new HashMap<>();
        System.out.println(frequencyMap(list));
    }

    public static <Integer> Map<Integer, Long>  frequencyMap(List<Integer> elements) {
        return elements.stream()
                .collect( Collectors.groupingBy( Function.identity(), Collectors.counting() ));
    }
}
