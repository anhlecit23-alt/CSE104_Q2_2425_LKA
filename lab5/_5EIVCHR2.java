import java.util.Scanner;

public class _5EIVCHR2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long max = -1;
        long result = 0;
        while (n-- > 0) {
            long money = sc.nextLong();
            result += money;
            if (money > max)
                max = money;
        }

        long discount = max * 3 / 10;
        if (discount > 50_000)
            discount = 50_000;
        result -= discount;
        System.out.println(result);
    }
}
