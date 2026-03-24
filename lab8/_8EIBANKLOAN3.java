import java.util.Scanner;

public class _8EIBANKLOAN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double n = sc.nextDouble();
        double r = sc.nextDouble() / 100;
        double f = sc.nextDouble() / 100;
        double b = x;
        double fixed = x / n;
        double paid = 0;
        int m = 1;
        while (b > 0) {// moi thang
            double in = b * r / 12;
            double ep = m * fixed;
            double pay = ep - paid;// goc can tra
            if (pay < 0)
                pay = 0;
            if (pay > b)
                pay = b;
            double req = in + pay;
            double ex = y - req;
            double repay = 0;
            if (ex > 0) {
                repay = ex / (1 + f);
                if (repay > b - pay)
                    repay = b - pay;
            }
            paid += repay + pay;
            b -= pay + repay;
            if (b < 0)
                b = 0;
            System.out.println(m + " " + Math.round(b));
            m++;
        }
    }
}
