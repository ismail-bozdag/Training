package org.example.stream;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

// Sayı tekse başına o, çiftse e getirmek.
public class Challenge {
    public static void main(String[] args) {
        Challenge.getString(asList(3,44));

    }
    public static String getString(List<Integer> list) {
        String b= list.stream().map(i -> {
            String s= "";
            if (i%2==0)
                s= "e"+i;
            else
                s= "o"+i;

            return s;
        }).collect(Collectors.joining(","));

        System.out.println(b);
        return null;

    }
}
