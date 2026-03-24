import java.util.Scanner;

public class _5EIINTEREST1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rate = sc.nextDouble();
        double save = 0;
        for (int i = 0; i < 12; i++) {
            double money = sc.nextDouble();
            save += money;
            save = save * (1 + rate);
        }
        System.out.println(Math.round(save));
    }
}
