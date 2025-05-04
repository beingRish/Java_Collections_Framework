package Java_8.Function;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        // Function --> Functional Interface --> work for you
        Function<Integer, Integer> doubleIt = x -> 2 * x;
        Function<Integer, Integer> tripleIt = x -> 3 * x;

        System.out.println(doubleIt.andThen(tripleIt).apply(20));   // 120
        System.out.println(tripleIt.andThen(doubleIt).apply(20));   // 120
        System.out.println(doubleIt.compose(tripleIt).apply(20));   // 120
        System.out.println(doubleIt.apply(100));    // 200

        Function<Integer, Integer> identity = Function.identity();
        Integer res = identity.apply(5);
        System.out.println(res);    // 5
    }
}
