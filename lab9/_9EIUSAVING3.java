import java.util.Scanner;

public class _9EIUSAVING3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        int n = sc.nextInt();
        double[] r = new double[] { 0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614, 0.0638,
                0.0664, 0.0692 };
        double left = 0;
        double right = 1e18;
        for (int i = 0; i < 100; i++) {
            double mid = (left + right) / 2;
            if (!check(m, n, r, mid)) {
                left = mid;
            } else
                right = mid;
        }
        System.out.printf("%.4f\n", left);
    }

    private static boolean check(double m, int n, double[] r, double mid) {
        // kiem tra xem thoa dieukien gain m ch
        double totalbalance = 0;
        for (int i = 1; i <= n; i++) {// bc same amount of money
            double deposit = mid;
            int month = i;
            while (month > 0) {
                int run = Math.min(12, month);
                deposit = deposit * (1 + run * r[run - 1] / 12.0);
                month -= run;
            }
            totalbalance += deposit;
        }
        return totalbalance >= m;
    }
}
