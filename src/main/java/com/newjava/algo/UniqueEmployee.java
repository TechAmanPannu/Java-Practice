package com.newjava.algo;

import java.util.*;

public class UniqueEmployee {

    public static void main(String arg[]) {
        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee(2, "naresh"));
        employees.add(new Employee(1, "zmit"));
        employees.add(new Employee(1, "amit"));


        employees.forEach(employee -> {
            System.out.println(String.format("Id : %s and Name : %s ", employee.getId(), employee.getName()));
        });

    }
}

class EmployeeModel {

    private long id;
    private String name;

    public EmployeeModel(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeModel that = (EmployeeModel) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

