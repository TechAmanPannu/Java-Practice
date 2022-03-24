package com.newjava.algo.codlity;

import java.util.*;
import java.util.stream.Collectors;

public class FirstUniqueNumber {

    public static void main(String arg[]) {

//        int[] a = {1, 4, 3, 3, 1, 2};
        int[] a = {6,4,4,6};
        System.out.println(new FirstUniqueNumber().getFirstUniqueNumber(a));
    }

    public  Integer getFirstUniqueNumber(int[] arr) {

        Map<Integer, Integer> frequency = new LinkedHashMap<>();
        for (int i : arr) {

            if (!frequency.containsKey(i)) {
                frequency.put(i, 1);
            } else {
                frequency.put(i, frequency.get(i) + 1);
            }
        }
        List<Item> items = new ArrayList<>();
        boolean isAnyUniqueNumber = false;
        for(Integer key :  frequency.keySet()) {
            items.add(new Item(frequency.get(key), key));
            isAnyUniqueNumber = frequency.get(key) == 1;
        }
        if(!isAnyUniqueNumber) {
            return -1;
        }
        items.sort(Comparator.comparing(Item::getFrequency));
        return  items.get(0).value;
    }

    class Item {

        private int frequency;
        private int value;

        public Item(int frequency, int value) {
            this.frequency = frequency;
            this.value = value;
        }

        public int getFrequency() {
            return frequency;
        }
    }
}
