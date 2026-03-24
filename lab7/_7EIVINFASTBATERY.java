import java.util.Scanner;

public class _7EIVINFASTBATERY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        double t = sc.nextDouble();
        double r = sc.nextDouble() / 100;
        double pow = Math.pow(1 + r, t);
        double payment = (r * (n - m / pow)) / (1 - 1 / pow);
        System.out.println(Math.round(payment));
    }
}
