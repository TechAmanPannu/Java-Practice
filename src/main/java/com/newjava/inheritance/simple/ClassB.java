package com.newjava.inheritance.simple;

/**
 * @author Amandeep Singh on 3/14/22/03/2022
 */
public class ClassB extends ClassA{

    public String printingB() {
        return "printing B";
    }

    @Override
    public String printingA(String str) {
        return "printing A";
    }
}
