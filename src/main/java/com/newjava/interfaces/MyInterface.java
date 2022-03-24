package com.newjava.interfaces;

/**
 * @author Amandeep Singh on 3/24/22/03/2022
 */
public class MyInterface {

    public static void main(String arg[]) {
        C c = new C();
        System.out.println(c.add());
    }

}


interface A {
     String add();
}

interface B {
    String add();
}

class C implements A, B {

    @Override
    public String add() {
        return "running add function";
    }
}


