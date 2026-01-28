import java.util.Scanner;

public class EIUSALES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double[] money = new double[] { 20, 30, 150, 300, 1_500, Long.MAX_VALUE };
        double[] rate = new double[] { 0.02, 0.03, 0.04, 0.05, 0.06, 0.07 };
        double bonus = 0;
        for (int i = 0; i < rate.length && n > 0; i++) {
            double amount = Math.min(n, money[i]);
            bonus += amount * rate[i];
            n -= amount;

        }
        System.out.printf("%.3f", bonus);
        sc.close();
    }
}
