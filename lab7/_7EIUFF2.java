import java.util.Scanner;

public class _7EIUFF2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble() / 100;
        double f = sc.nextDouble() / 100;
        double c = sc.nextDouble();
        System.out.println((long) Math.ceil(c / (r - f)));
    }
}
