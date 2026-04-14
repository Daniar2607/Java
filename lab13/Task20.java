import java.util.*;
import java.util.stream.Collectors;

class Order {
    String product;
    int quantity;
    double price;

    Order(String product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return product + " " + quantity + " " + price;
    }
}

public class Task20 {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("Coffee", 2, 1500),
                new Order("Tea", 1, 800),
                new Order("Coffee", 3, 1500)
        );

        double total = orders.stream()
                .map(o -> o.price * o.quantity)
                .reduce(0.0, Double::sum);

        System.out.println("Total: " + total);

        orders.stream()
                .collect(Collectors.groupingBy(o -> o.product))
                .forEach((k,v) -> System.out.println(k + " -> " + v));
    }
}