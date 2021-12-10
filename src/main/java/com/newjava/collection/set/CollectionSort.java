package com.newjava.collection.set;

import java.util.*;

/**
 * @author Amandeep Singh on 12/10/21/12/2021
 */
public class CollectionSort {

    public static void main(String arg[]) {

        // numbers
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(9);
        integers.add(10);
        integers.add(2);
        Collections.sort(integers, (Integer a, Integer b) -> b - a);
        System.out.println(integers.get(0));

        // strings
        List<String> strings = new ArrayList<>();
        strings.add("aman");
        strings.add("0man");
        strings.add("sman");
        strings.add("pman");

        Collections.sort(strings, Collections.reverseOrder());
        System.out.println(strings.get(0));

        // Object with multivalue
        List<User> users = new ArrayList<>();
        users.add(new User("aman", "singh", 10));
        users.add(new User("0man", "0ingh", 20));
        users.add(new User("pman", "pingh", 2));
        users.add(new User("lman", "lingh", 3));
//        System.out.println(sortOnSingleValues(users).get(0).getAge());
        System.out.println(sortOnMultipleValues(users).get(0).getFirstName());
    }

    public static List<User> sortOnMultipleValues( List<User> users) {

        Collections.sort(users, Comparator.comparing(User::getFirstName)
        .thenComparing(User::getAge));
        return users;
    }

    public static List<User> sortOnSingleValues( List<User> users) {

        users.sort((User user_1 , User user_2) -> {
            return user_2.getAge() -  user_1.getAge();
        });
        return users;
    }
}

class User {

    private String firstName;
    private String lastName;
    private int age;
    public User(String firstName, String lastName, int age) {
        this.firstName  = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
