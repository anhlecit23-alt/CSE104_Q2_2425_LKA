import java.util.Scanner;

public class EIUSAVING2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_months = sc.nextInt();// so lan them tien vao tk
        int months = num_months;// tong so thang con lai
        double max_money = 0;
        double[] rate = new double[] { 3.90, 3.92, 3.95, 3.99, 4.04, 5.54, 5.72,
                5.92, 6.14, 6.38, 6.64, 6.92 }; // %/năm
        while (num_months-- > 0) { // mỗi vòng là 1th gửi tiền
            double money = sc.nextDouble();
            double value = money; // gt cuối của khoản tiền sau lãi
            int m = months; // SỐ THÁNG MÀ KHOẢN TIỀN NÀY CÒN TRONG NGÂN HÀNG
            while (m > 0) {// chỉ chạy cho 1 khoản tiền hiện tại
                int run = Math.min(12, m);
                value += value * rate[run - 1] / 1200 * run;
                m -= run; // giảm số tháng đã tính
            }
            max_money += value; // cộng vào tổng và sau đó sang tháng mới
            months--;// thời gian gửi của tháng kế
        }
        System.out.println(Math.round(max_money));
    }

}
