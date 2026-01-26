import java.util.Scanner;

public class EIUCUBES2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long[] a = new long[k];
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextLong();
        for (int i = 0; i < a.length; i++) {
            long layer = 0;
            while (a[i] >= 0) {
                layer++;
                a[i] -= layer * (layer + 1) / 2;
            }
            System.out.print(layer - 1 + " ");
        }
        sc.close();
    }
}
