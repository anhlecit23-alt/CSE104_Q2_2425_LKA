import java.util.Scanner;

public class EIDISCOU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        double[] rate = new double[] { 0, 0.03, 0.05, 0.07, 0.1, 0.12, 0.15 };
        double[] money = new double[] { 0, 2000000, 10000000, 50000000, 100000000, 200000000, 500000000,
                Long.MAX_VALUE };
        double totalDiscount = 0;
        for (int i = 1; i < money.length; i++) {
            if (n > money[i - 1]) {
                double amount = Math.min(n, money[i]) - money[i - 1];
                totalDiscount += amount * rate[i - 1];
            }
        }

        System.out.println(Math.round(n - totalDiscount));
    }
}
