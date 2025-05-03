package Lecture12;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Student implements Comparable<Student>{
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() { return name; }

    public double getGpa() { return gpa; }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Double.compare(gpa, student.gpa) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gpa);
    }

    @Override
    public int compareTo(Student student) {
        return Double.compare(student.getGpa(), this.getGpa());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Alice", 3.5));
        list.add(new Student("Bob", 3.7));
        list.add(new Student("Charlie", 3.5));
        list.add(new Student("Akshit", 3.9));
        list.sort(null);
        System.out.println(list);
    }
}
