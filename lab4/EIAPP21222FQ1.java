import java.util.Scanner;

public class EIAPP21222FQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        int num_months = sc.nextInt();
        double[] rate = new double[] { 3.90, 3.92, 3.95, 3.99, 4.04, 5.54, 5.72,
                5.92, 6.14, 6.38, 6.64, 6.92 };
        double max_money = money;
        if (num_months <= 12) {
            max_money = money + money * rate[num_months - 1] / (100 * 12) * num_months;
        } else {
            int k = num_months / 12;
            for (int i = 0; i < k; i++) {
                max_money += max_money * rate[11] / (100 * 12) * 12;
            }
            num_months -= 12 * k;
            max_money += max_money * rate[num_months - 1] / (100 * 12) * num_months;
        }
        System.out.println(Math.round(max_money));
        sc.close();
    }
}
