import java.util.Scanner;

public class _5EIVCHR1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long discount = n * 3 / 10;
        if (discount > 50_000)
            discount = 50_000;
        System.out.println(n - discount);
        sc.close();
    }
}
