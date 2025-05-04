package Java_8.Predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        // Predicate --> Functional Interface( Boolean valued function )
        Predicate<Integer> isEven = x -> x % 2 == 0;
        Predicate<String> isWordStartingWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> isWordEndingWithT = x -> x.toLowerCase().endsWith("t");
        Predicate<String> and = isWordStartingWithA.and(isWordEndingWithT);

        System.out.println(isEven.test(4));
        System.out.println(isWordStartingWithA.test("Ankit"));
        System.out.println(isWordEndingWithT.test("Ankit"));
        System.out.println(and.test("Akshay"));
    }
}