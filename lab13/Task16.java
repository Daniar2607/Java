import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Task16 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ali", 20),
                new Student("Dana", 20),
                new Student("Nurlan", 21)
        );

        Map<Integer, List<Student>> map =
                students.stream()
                        .collect(Collectors.groupingBy(s -> s.age));

        System.out.println(map);
    }
}