package Streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(numbers);
        System.out.println(IntStream.range(1, 5).boxed().collect(Collectors.toList())); // [1, 2, 3, 4]
        System.out.println(IntStream.rangeClosed(1, 5).boxed().collect(Collectors.toList()));   // [1, 2, 3, 4, 5]

        IntStream.of(1, 2, 3);

        IntStream ints = new Random().ints(5);
        System.out.println(ints.boxed().toList());

        DoubleStream doubles = new Random().doubles(5);
        System.out.println(doubles.boxed().toList());
    }
}
