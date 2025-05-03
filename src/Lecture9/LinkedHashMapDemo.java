package Lecture9;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
//        HashMap<String, Integer> hashMap = new HashMap<>();
//        hashMap.put("Orange", 10);
//        hashMap.put("Apple", 20);
//        hashMap.put("Guava", 13);
//
//        for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11, 0.3f, true);
        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Guava", 13);

        linkedHashMap.get("Apple");
        linkedHashMap.get("Orange");
        linkedHashMap.get("Guava");
        linkedHashMap.get("Orange");
        linkedHashMap.get("Apple");
        linkedHashMap.get("Orange");
        linkedHashMap.get("Guava");
        linkedHashMap.get("Orange");
        linkedHashMap.get("Apple");
        linkedHashMap.get("Guava");

        for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
