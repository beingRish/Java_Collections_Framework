package Lecture21;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverview {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(67);
        System.out.println(set.size());
        System.out.println(set);
        System.out.println(set.contains(12));
        System.out.println(set.remove(67));
        set.clear();
        System.out.println(set.isEmpty());
        for(int i: set) {
            System.out.println(i);
        }

        // for thread safety
        Set<Integer> set1 = new ConcurrentSkipListSet<>();

        // unmodifiable
        Set<Integer> integers = Set.of(1, 2, 3, 4, 2, 34, 52, 33, 5453, 64352, 24);

    }
}
