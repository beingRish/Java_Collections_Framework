package Lecture22;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque1 = new ArrayDeque();   // faster iteration, low memory, no null allowed
        // circular, head and tail
        // no need to shift elements, just shift head and tail
        deque1.addFirst(10);
        deque1.addLast(20);
        deque1.offerFirst(5);
        deque1.offerLast(25);
        System.out.println(deque1); // [5, 10, 20, 25]

        System.out.println("First Element: " + deque1.getFirst());  // Output 5
        System.out.println("Last Element: " + deque1.getLast());  // Output 25
        deque1.removeFirst();   // Removes 5
        deque1.pollLast();  // Removes 25
        // Current Deque: [10, 20]
        for (int num: deque1) {
            System.out.println(num);
        }


        Deque<Integer> deque2 = new LinkedList<>(); // insertion, deletion somewhere in middle
        deque2.remove();
    }
}
