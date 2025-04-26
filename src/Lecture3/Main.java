package Lecture3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return  s2.length() - s1.length();
    }
}

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

public class Main {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("banana", "apple", "date");
        words.sort(new StringLengthComparator());
        System.out.println(words);

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(4);

        list.sort(new MyComparator());
        System.out.println(list);
    }
}
