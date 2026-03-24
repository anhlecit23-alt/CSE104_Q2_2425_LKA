import java.util.Scanner;

public class _8EIBANKLOAN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double r = sc.nextDouble() / 1200;
        int month = 0;
        while (x > 0) {
            x = x * (1 + r);
            x -= y;
            month++;
        }
        System.out.println(month);
    }
}
