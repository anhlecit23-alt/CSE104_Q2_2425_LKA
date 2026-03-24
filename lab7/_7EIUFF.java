import java.util.Scanner;

public class _7EIUFF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble() / 100;
        double f = sc.nextDouble() / 100;
        double y = sc.nextDouble();
        double n = sc.nextDouble();
        double x;
        if (Math.abs(r - f) < 1e-12) { // equals or not
            x = y * (n - 1) / (1 + r);
        } else {
            x = y * (1 - Math.pow((1 + f) / (1 + r), n - 1)) / (r - f);
        }
        System.out.printf("%.4f", x);
    }
}
