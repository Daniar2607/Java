import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "hi", "programming");

        list.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }
}