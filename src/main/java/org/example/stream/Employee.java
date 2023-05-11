package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Employee {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ali", Arrays.asList("Yönetici", "Muhasebeci")));
        employees.add(new Employee("Veli", Arrays.asList("Satış Temsilcisi")));


        List<String> allRoles = employees.stream()
                .flatMap(employee -> employee.getRoles().stream())
                .collect(Collectors.toList());

        System.out.println(allRoles); // [Yönetici, Muhasebeci, Satış Temsilcisi]
    }
    private String name;
    private List<String> roles;

    public Employee(String name, List<String> roles) {
        this.name = name;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public List<String> getRoles() {
        return roles;
    }
}


