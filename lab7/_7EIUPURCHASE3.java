import java.util.Scanner;

public class _7EIUPURCHASE3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double m = sc.nextDouble();
        double n = sc.nextDouble();
        double r = sc.nextDouble();
        double debt = p - m;
        double payment = debt * r / (1 - Math.pow(1 + r, -n));
        System.out.println(Math.round(payment));
    }
}
