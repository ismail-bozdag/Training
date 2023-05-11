package org.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {

    }

    public static List<String> transform(List<List<String>> collection) {
        List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection : collection) {
            for (String value : subCollection) {
                newCollection.add(value);
            }
        }
        return newCollection;
    }

    public static List<String> transform2(List<List<String>> collection) {

        return collection.stream()
                .flatMap(mahmut -> mahmut.stream())
                .collect(Collectors.toList());

    }
}


