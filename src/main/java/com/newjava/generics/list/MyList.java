package com.newjava.generics.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amandeep Singh on 3/14/22/03/2022
 */
public class MyList<T>{

    private List<T> values;

    public boolean add(T value) {
        if(value == null) { return false; }
        if(values == null || values.isEmpty()) {
            values = new ArrayList<>();
        }
        return values.add(value);
    }

//    @Override
//    public String toString() {
//        if(values == null){
//            return null;
//        }
//        if(values.isEmpty()) {
//            return "[]";
//        }
//        String str = "[";
//        String.join(",", values)
//    }
}
