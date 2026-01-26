import java.util.Scanner;

public class EIUTHU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int trung = findK(a, b);
        int total = a.length() - trung + b.length();
        System.out.println(total);
        sc.close();
    }

    private static int findK(String a, String b) {
        // tìm số lượng chữ trùng nhau đầu cuối
        int max = Math.min(a.length(), b.length());
        for (int k = max; k >= 1; k--) {
            if (a.substring(a.length() - k, a.length())
                    .equals(b.substring(0, k)))
                return k;
        }
        return 0;
    }
}
