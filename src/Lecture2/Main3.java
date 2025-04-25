package Lecture2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

        list.sort(null);

        System.out.println(list);

//        Object[] array = list.toArray();
//        Integer[] array1 = list.toArray(new Integer[0]);

    }
}
