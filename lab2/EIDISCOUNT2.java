import java.util.Scanner;

public class EIDISCOUNT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = n;
        double[] money = new double[] { 5_000_000, 15_000_000, 80_000_000, 200_000_000, 300_000_000, 300_000_000,
                Long.MAX_VALUE };
        double[] rate = new double[] { 0, 0.03, 0.05, 0.07, 0.1, 0.12, 0.15 };
        double totalDiscount = 0;
        for (int i = 0; i < rate.length && n > 0; i++) {
            double k = Math.min(n, money[i]);
            totalDiscount += k * rate[i];
            n = (long) (n - k);
        }
        System.out.println(Math.round(m - totalDiscount));
        sc.close();
    }
}
