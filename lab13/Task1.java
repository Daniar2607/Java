import java.util.function.BinaryOperator;

public class Task1 {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(5, 3));
    }
}