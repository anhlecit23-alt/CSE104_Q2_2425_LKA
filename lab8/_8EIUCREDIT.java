import java.util.Scanner;

public class _8EIUCREDIT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double rate = sc.nextDouble() / 30;
        int t = sc.nextInt();
        long[] tran = new long[t + 1];
        double balance = 0;
        double debt = 0;
        double in = 0;
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            double amount = sc.nextDouble();
            tran[day] += amount;
        }
        for (int i = 1; i <= t; i++) {
            balance += tran[i];
            if (balance < 0)
                debt += balance;
            if (i % 30 == 0) {
                in = debt * rate;
                balance += in;
                debt = 0;
                in = 0;
            }
        }
        System.out.printf("%.2f", balance);
        sc.close();
    }
}
