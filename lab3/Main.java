import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("x = ");
        double x = sc.nextDouble();

        double y = -Math.sin(x) + (Math.pow(x, 3) + 2) / (Math.pow(x, 2) + 3) + 17;

        System.out.println("y = " + y);

        sc.close();
    }
}
