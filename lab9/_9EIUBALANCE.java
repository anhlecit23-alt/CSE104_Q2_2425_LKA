import java.util.Scanner;

public class _9EIUBALANCE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        double[] a = new double[m];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextDouble();
        }
        double save = 0;
        double x = sc.nextDouble();
        double r = sc.nextDouble() / 1200;
        double f = sc.nextDouble() / 1200;
        for (int i = 0; i < 2 * m; i++) {
            // thang co thu nhap
            if (i < m) {
                save += a[i] - x;
                save = save * (1 + r);
                x = x * (1 + f);
            } else {// thang k co thu nhap
                save -= x;
                save = save * (1 + r);
                x = x * (1 + f);
            }

        }
        if (save < 0)
            save = 0;
        System.out.println(Math.round(save));
    }
}
