package com.newjava.immutable;

/**
 * @author Amandeep Singh on 3/24/22/03/2022
 */

public final class MyClass {  //// creating class final so that no class can extend this class

    private final String value;  /// creating all instance variable as final so that it can be initialize only once while creating the object
        /// creating all the instance variable as private so that it cannot be access from outside.

    public MyClass(String value) {
        this.value = value;
    }

    public String getValue() {  /// create only getter methods so it cannot able to change the value of instance variables
        return value;
    }
}


class Driver {

    public static void main (String arg[]) {


        MyClass myClass = new MyClass("aman");


    }
}
