package org.example.stream;

import java.util.Arrays;

//give me the total number of letters in all the names with more than 5 letters
public class LetterCount {


    public static void main(String[] args) {
        String[] names = { "william", "jones", "aaron", "seppe", "frank", "gilliam"};
        getTotalNumberOfLettersOfNamesLongerThanFive(names);
    }

    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        int sum = Arrays.stream(names).filter(name -> name.length() > 5).mapToInt(name -> name.length()).sum();
        System.out.println(sum);
        return sum;
    }


}
