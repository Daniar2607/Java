import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "hello", "programming");

        list.stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);
    }
}