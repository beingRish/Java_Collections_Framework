package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
        System.out.println(isAnyMatch);
        boolean isAllMatch = list.stream().allMatch(x -> x > 0);
        System.out.println(isAllMatch);
        boolean isNoneMatch = list.stream().noneMatch(x -> x < 0);
        System.out.println(isNoneMatch);

        // 6. findFirst, findAny
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());

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
    }
}
