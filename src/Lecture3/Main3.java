package Lecture3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() { return name; }

    public double getGpa() { return gpa; }
}

public class Main3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Akshit", 3.9));

        Comparator<Student> comparator = Comparator
                .comparing(Student::getGpa)
                .reversed()
                .thenComparing(Student::getName);

        students.sort(comparator);
//        Collections.sort(students, comparator);

        students.sort((o1, o2) -> {
            if((o2.getGpa() - o1.getGpa()) > 0) {
                return 1;
            } else if ((o2.getGpa() - o1.getGpa()) < 0) {
                return -1;
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        });


        for(Student s : students) {
            System.out.println(s.getName() + ": " + s.getGpa());
        }

    }
}
