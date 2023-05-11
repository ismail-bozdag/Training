package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {

    public static void main(String[] args) {

            String[] names={ "Ali", "Ahmet", "Mehmet", "Aylin"};

            mapToUppercase2(names);

    }

    public static Collection<String> mapToUppercase(String[] names) {
        Collection<String> uppercaseNames = new ArrayList<>();
        for(String name : names) {
            uppercaseNames.add(name.toUpperCase());
        }
        return uppercaseNames;
    }
    public static Collection<String> mapToUppercase2(String[] names) {
        List<String> collect = Arrays.stream(names).map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);
        return collect;
    }
}
