import java.util.Scanner;

public class _8EIUBHOUSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        int k = sc.nextInt();
        double x = sc.nextDouble() / 100;
        double debt = n - m;
        double fixed = debt / k;
        for (int i = 1; i <= k; i++) {
            double in = debt * x;
            debt -= fixed;
            System.out.println(i + " " + Math.round(fixed + in));
        }
    }
}
