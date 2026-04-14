import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,2,9,1);

        int max = list.stream()
                .max(Integer::compare)
                .orElse(0);

        System.out.println(max);
    }
}