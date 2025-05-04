package Java_8;

import java.util.function.*;

public class CombinedExample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if(predicate.test(supplier.get())) {
            consumer.accept(function.apply(supplier.get()));    // 10000
        }

        // BiPredicate, BiConsumer, BiFunction

        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2 == 0;
        System.out.println(isSumEven.test(5, 5));   // true

        BiConsumer<Integer, String> print = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        print.accept(23, "twenty three");

        BiFunction<String, String, Integer> biFunction = (x, y) -> (x + y).length();
        System.out.println(biFunction.apply("a", "bc"));    // 3

        // UnaryOperator, BinaryOperator
        UnaryOperator<Integer> a = x -> 2 * x;
        BinaryOperator<Integer> b = (x, y) -> x + y;
    }
}
