import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("x = ");
        double x = sc.nextDouble();

        // Формула: f(x) = ln(1.5x) - 4 + 5x^4 + 3x^3
        double y = Math.log(1.5 * x) - 4 + 5 * Math.pow(x, 4) + 3 * Math.pow(x, 3);

        System.out.println("y = " + y);

        sc.close();
    }
}
