package Lecture8;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Rishabh");
        map.put(2, "Ritik");
        map.put(3, "Vishwjeet");
        map.put(34, "Shashank");
        map.put(45, "Suryanshu");
        System.out.println(map);

        String student = map.get(3);
        System.out.println(student);

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Vishwjeet"));

        for(int i : map.keySet()) {
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry : entries) {
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);

//        map.remove(34);
        boolean isRemoved = map.remove(45, "Prince");
        System.out.println("Removed ? :" + isRemoved);
        System.out.println(map);

        List<Integer> list = Arrays.asList(2, 4, 32, 4, 432);
        list.contains(32);

    }
}
