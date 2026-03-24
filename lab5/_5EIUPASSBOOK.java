import java.util.Scanner;

public class _5EIUPASSBOOK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        int m = sc.nextInt();
        double r1 = sc.nextDouble() / 100;
        double r2 = sc.nextDouble() / 100;
        double passbook = x * (1 + r1 * n / 12.0);
        int months = n - m;
        int years = months / 12;
        double remain = (double) months % 12 / 12.0;
        double loanFactor = Math.pow(1 + r2, years) * (1 + r2 * remain);
        double y = passbook / loanFactor;
        System.out.println(Math.round((Math.max(x, y))));
    }
}
