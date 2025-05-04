package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);

        // 1. collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        // 2. forEach
        list.stream().forEach(x -> System.out.println(x));

        // 3. reduce
        Optional<Integer> optionalInteger = list.stream().reduce(Integer::sum);
        System.out.println(optionalInteger.get());

        // 4. count

        // 5. anyMatch, allMatch, nonMatch
        boolean isAnyMatch = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(isAnyMatch); // true
        boolean isAllMatch = list.stream().allMatch(x -> x > 0);
        System.out.println(isAllMatch); //true
        boolean isNoneMatch = list.stream().noneMatch(x -> x < 0);
        System.out.println(isNoneMatch);    // true

        // 6. findFirst, findAny
        System.out.println(list.stream().findFirst().get());    // 1
        System.out.println(list.stream().findAny().get());  // 1

        // 7. toArray
        Object[] array = Stream.of(1, 2, 3).toArray();

        // 8. min / max
        System.out.println("max: " + Stream.of(2, 44, 69).max((o1, o2) -> o1 - o2));  // max: Optional[69]
        System.out.println("min: " + Stream.of(2, 44, 69).min(Comparator.naturalOrder()));  // min: Optional[2]

        // 9. forEachOrdered
        List<Integer> numbers0 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Using forEach with parallel stream: ");
        numbers0.parallelStream().forEach(System.out::println);
        System.out.println("Using forEachOrdered with parallel stream: ");
        numbers0.parallelStream().forEachOrdered(System.out::println);

        // Examples: Filtering and Collecting Names
        List<String> names = Arrays.asList("Anna", "Bob", "Rishabh", "Ritik", "Raj");
        System.out.println(names.stream().filter(x -> x.length() > 3).toList());    // [Anna, Rishabh, Ritik]

        // Examples: Squaring and Sorting Numbers
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 6);
        System.out.println(numbers.stream().map(x -> x * x).sorted().toList()); // [1, 4, 25, 36, 81]

        // Examples: Summing Values
        List<Integer> number2 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(number2.stream().reduce(Integer::sum).get());    // 15

        // Examples: Counting Occurrences of a character
        String sentnce = "Hello world";
        char[] charArray = sentnce.toCharArray();
        System.out.println(sentnce.chars().filter(x -> x == 'l').count());  // 3

        // Example
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
//        List<String> list1 = stream.map(String::toUpperCase).toList();  // exception
    }
}
