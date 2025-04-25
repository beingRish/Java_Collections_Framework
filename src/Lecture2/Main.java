package Lecture2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            System.out.println(list.getClass().getName());

            List<String> list1 = Arrays.asList("Monday", "Tuesday");
            System.out.println(list1.getClass().getName());
            list1.set(1, "Wednesday");
            System.out.println(list1.get(1));

            String[] array = {"Apple", "Banana", "Cherry"};
            List<String> list2 = Arrays.asList(array);
            System.out.println(list2.getClass().getName());

            List<String> list3 = new ArrayList<>(list2);
            list3.add("Mango");
            System.out.println(list3);


            /*
            ArrayList<Integer> list = new ArrayList<>();

            list.add(1);    // 0 index
            list.add(5);    // 1 index
            list.add(80);   // 2 index

            System.out.println(list.get(2));
            System.out.println(list.size());
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }

            list.remove(2);

            for(int x : list) {
                System.out.println(x);
            }

            System.out.println(list.contains(5));
            System.out.println(list.contains(30));

            list.add(2, 50);

            for(int x : list) {
                System.out.println(x);
            }

            list.set(2, 50);
            System.out.println(list);

            list.add(1);
            list.add(1);
            list.add(1);
            list.add(1);
            list.add(1);
            list.add(1);
            list.add(1);
            list.add(1);
            list.add(1);
            list.add(1);
            list.add(1);
            list.add(1);
            list.add(1);
            System.out.println(list.size());



             */
    }
}
