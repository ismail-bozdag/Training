package org.example.lambda;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class HazirInterfaceKullanimi {

    public static void main(String[] args) {
        BinaryOperator<Integer> op =
                BinaryOperator.maxBy((a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));

        System.out.println(op.apply(98, 11));

        Comparator<Integer> comparator = (a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1);
        BinaryOperator<Integer> op2 = BinaryOperator.maxBy(comparator);

        System.out.println(op2.apply(98, 11));
    }
}
