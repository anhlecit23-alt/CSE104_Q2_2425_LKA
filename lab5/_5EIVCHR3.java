import java.util.Arrays;
import java.util.Scanner;

public class _5EIVCHR3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int items = sc.nextInt();
        int voucher = sc.nextInt();
        long[] a = new long[items];
        long bill = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLong();
            bill += a[i];
        }
        Arrays.sort(a);
        for (int i = a.length - 1; i >= 0 && voucher > 0; i--) {
            long discount = a[i] * 3 / 10;
            if (discount > 50_000)
                discount = 50_000;
            bill -= discount;
            voucher--;
        }
        System.out.println(bill);
        sc.close();
    }
}
