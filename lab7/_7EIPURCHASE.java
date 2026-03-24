import java.util.Scanner;

public class _7EIPURCHASE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        int t = sc.nextInt();
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        double remain = v - n;
        double left = 0.00;
        double right = 1.00;
        double mid = 0.0;
        for (int i = 0; i < 27; i++) {
            mid = (left + right) / 2;
            if (check(remain, t, m, mid) > 0)
                right = mid;
            else
                left = mid;
        }
        System.out.printf("%.7f", mid);
    }

    private static double check(double remain, int t, double m, double r) {
        // kiem tra lai suat da dung chua
        for (int i = 0; i < t; i++) {
            remain = remain * (1 + r) - m;
        }
        return remain;
    }
}
