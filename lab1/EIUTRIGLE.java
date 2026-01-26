import java.util.Arrays;
import java.util.Scanner;

public class EIUTRIGLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int tria = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length - 2; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                int k = a[i] + a[j];
                tria += greater(a, k, j);
            }
        }
        System.out.println(tria);
        sc.close();
    }

    private static int greater(int[] a, int n, int con) {
        // tìm xem có mấy số nhỏ hơn số n trong mảng
        int count = 0;
        for (int i = con + 1; i < a.length; i++) {
            if (a[i] < n)
                count++;
        }
        return count;

    }
}
