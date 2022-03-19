package com.newjava.algo;

import java.util.*;

public class SortByIdAndName {

    public static void main(String arg[]) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(2, "naresh"));
        employees.add(new Employee(1, "zmit"));
        employees.add(new Employee(1, "amit"));

        Comparator comparator  = Comparator.comparing(Employee::getId);
        comparator = comparator.thenComparing(Comparator.comparing(Employee::getName));
        Collections.sort(employees, comparator);

        employees.forEach(employee -> {
            System.out.println(String.format("Id : %s and Name : %s ", employee.getId(), employee.getName()));
        });

    }
}

class Employee {

    private long id;
    private String name;

    public Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId(){
        return id;
    }

    public String getName() {
        return name;
    }
}
