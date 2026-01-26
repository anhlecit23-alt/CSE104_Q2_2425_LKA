import java.util.Scanner;

public class EIINCRDES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int trend = 0; // 0 none, 1 tang, 2 giam
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();
        if (a[0] > a[1])
            trend = 2;
        else if (a[0] < a[1])
            trend = 1;
        else
            trend = 0;
        if (trend == 0) {
            System.out.println("none");
            return;
        } else if (trend == 1) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] >= a[i + 1]) {
                    System.out.println("none");
                    return;
                }
            }
            System.out.println("increasing");
        } else {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] <= a[i + 1]) {
                    System.out.println("none");
                    return;

                }
            }
            System.out.println("decreasing");
        }
        sc.close();
    }
}
