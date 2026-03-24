import java.util.Scanner;

public class _8EIUCARLOAN2 {
    static double equity(double loan, int n, int t, double rYear, double P, double L) {
        // gtri xe tru du no
        double car = 0.9 * P * Math.pow(1 - L / 100.0, t);
        double r = rYear / 12.0;

        if (r < 1e-12) {
            double balance = loan * (1.0 - (double) t / n);
            return car - balance;
        }

        double pay = loan * r / (1 - Math.pow(1 + r, -n));
        pay = Math.round(pay * 100.0) / 100.0;

        double balance = loan * Math.pow(1 + r, t)
                - pay * (Math.pow(1 + r, t) - 1) / r;

        return car - balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double P = sc.nextDouble();
        double newP = sc.nextDouble();
        double m = sc.nextDouble();
        int n = sc.nextInt();
        int k = sc.nextInt();
        double L = sc.nextDouble();

        double loan = P * (1 - m / 100.0);
        double need = newP * m / 100.0;

        double left = 0, right = 1;

        for (int i = 0; i < 100; i++) {
            double mid = (left + right) / 2.0;

            if (equity(loan, n, k - 1, mid, P, L) <= need)
                right = mid;
            else
                left = mid;
        }

        System.out.printf("%.4f\n", left);
    }
}
