import java.util.Scanner;

public class EIUMADIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long maxDif = 0;
        for (int i = 0; i < n; i++)
            a[i] = sc.nextLong();
        long min = a[0];
        for (int i = 0; i < a.length; i++) {
            long dif = a[i] - min;
            if (dif > maxDif)
                maxDif = dif;
            if (a[i] < min)
                min = a[i];
        }
        System.out.println(maxDif);
        sc.close();
    }
}
