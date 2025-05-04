package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        // Creating Streams From collections
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());

        // Creating Streams From Arrays
        String[] array = {"a", "b", "c"};
        Arrays.stream(array);

        // Using Stream.of()
        Stream<String> stream = Stream.of("a", "b");

        // Infinite Streams
        Stream<Integer> generate = Stream.generate(() -> 1);
        List<Integer> collect = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
        System.out.println(collect);
    }
}
