package Lecture11;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        String key1 = new String("key");
        String key2 = new String("key");
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());
        Map<String, Integer> map = new IdentityHashMap<>();
        // IdentityHashCode and ==
        map.put(key1, 1); // key, 1
        map.put(key2, 2); // key, 2
        System.out.println(key1.equals(key2));
        System.out.println(map);
    }
}
