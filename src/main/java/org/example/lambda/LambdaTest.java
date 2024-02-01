package org.example.lambda;

import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.function.*;

public class LambdaTest {

    public static void main(String[] args) {
        Selamla turkBiriniSelamla= ()-> System.out.println("Tanrı Türk'e yar olsun") ;
        Selamla arabiSelamla= ()-> System.out.println("Selamın Aleyküm") ;
        Selamla ingilizBiriniSelamla= ()-> System.out.println("hey George versene Bourche") ;

        ingilizBiriniSelamla.selam();
        turkBiriniSelamla.selam();
        arabiSelamla.selam();
        // 1. Runnable interface kullanımı
        Runnable runnable = () -> System.out.println("Hello from Runnable");
        runnable.run();

        // 2. ActionListener interface kullanımı
        ActionListener listener = event -> System.out.println("Action performed");
        listener.actionPerformed(null);

        // 3. Comparator interface kullanımı
        Comparator<Integer> comparator = Integer::compareTo;
        System.out.println("Comparator result: " + comparator.compare(5, 3));

        // 4. Predicate interface kullanımı
        Predicate<String> predicate = s -> s.length() > 5;
        System.out.println("Predicate result: " + predicate.test("Lambda"));

        // 5. Function interface kullanımı
        Function<Integer, String> function = number -> Integer.toString(number);
        System.out.println("Function result: " + function.apply(123));

        // 6. Supplier interface kullanımı
        Supplier<String> supplier = () -> "Hello from Supplier";
        System.out.println("Supplier result: " + supplier.get());

        // 7. UnaryOperator interface kullanımı
        UnaryOperator<Integer> unaryOperator = number -> number * number;
        System.out.println("UnaryOperator result: " + unaryOperator.apply(5));

        // 8. BinaryOperator interface kullanımı
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println("BinaryOperator result: " + binaryOperator.apply(3, 7));
    }

}
