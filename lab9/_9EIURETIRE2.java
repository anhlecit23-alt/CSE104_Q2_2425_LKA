import java.util.Scanner;

public class _9EIURETIRE2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double r = sc.nextDouble() / 1200;
        double f = sc.nextDouble() / 1200;
        double[] a = new double[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextDouble();
        }
        double left = 0;
        double right = 1e18;
        for (int i = 0; i < 100; i++) {
            double mid = (left + right) / 2;
            if (!check(a, r, f, mid))
                right = mid;
            else
                left = mid;
        }
        System.out.println((long) Math.floor(left));

    }

    private static boolean check(double[] a, double r, double f, double x) {
        // ham kiem tra voi so x0
        double save = 0;
        for (int i = 0; i < 1200; i++) {
            if (i < a.length) {
                save += a[i] - x;
                save = save * (1 + r);
                x = x * (1 + f);
            } else {
                save -= x;
                save = save * (1 + r);
                x = x * (1 + f);
            }
        }
        return save >= 0;
    }
}
