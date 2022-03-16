package com.newjava;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeDots {


    public void getParameters(Object... userProperties){

        System.out.println("size of properties "+userProperties.length);


    }

    public int sum(int... numbers) {
        int sum = 0;
        for (int number :  numbers) {
            sum = sum + number;
        }
        return sum;
    }
    public static void main(String... arg){

        new ThreeDots().getParameters("amandeep", "amandeep@gmail.com", 30, 15000000);
        System.out.println(new ThreeDots().sum(1,2,3,4,5,6));
    }
}
