package Lecture21;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        // Thread-Safe
        // Copy-On-Write Mechanizm
        // No Duplicate Elements
        // Iterates Do Not Reflect Modifications

        CopyOnWriteArraySet<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for(int i = 1; i <= 5; i++) {
            copyOnWriteArraySet.add(i);
            concurrentSkipListSet.add(i);
        }
        System.out.println("Initial CopyOnWriteArraySet: " + copyOnWriteArraySet);
        System.out.println("Initial concurrentSkipListSet: " + concurrentSkipListSet);

        System.out.println("\nIteerating and modifying CopyOnWriteArraySet:");
        for(Integer num : copyOnWriteArraySet) {
            System.out.println("Reading from CopyOnWriteArraySet: " + num);
            // Attempting to modify the set during iteration
            copyOnWriteArraySet.add(6);
        }

        System.out.println("\nIteerating and modifying concurrentSkipListSet:");
        for(Integer num : concurrentSkipListSet) {
            System.out.println("Reading from concurrentSkipListSet: " + num);
            // Attempting to modify the set during iteration
            concurrentSkipListSet.add(6);
        }
    }
}
