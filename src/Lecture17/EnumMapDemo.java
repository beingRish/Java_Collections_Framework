package Lecture17;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        // array of size same as enum
        // [_,"Gym",_,_,_,_]
        // no hashin
        // ordinal/index is used
        // Faster than HashMap
        // Memory Efficient
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.TUESDAY, "Gym");
        map.put(Day.MONDAY, "Walk");
        String s = map.get(Day.TUESDAY);
        System.out.println(map);
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}