package com.newjava.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Amandeep Singh on 12/10/21/12/2021
 */
public class TreeSetPractice {

    public static void main(String arg[]) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        System.out.println(getMin(numbers));
        System.out.println(getMax(numbers));
    }

    public static  int getMin(Set<Integer> numbers) {
        Set<Integer> treeNumbers = new TreeSet<>(numbers);
        return treeNumbers.iterator().next();
    }

    public static  int getMax(Set<Integer> numbers) {
        TreeSet<Integer> treeNumbers = new TreeSet<>(numbers);
        return treeNumbers.last();
    }
}
