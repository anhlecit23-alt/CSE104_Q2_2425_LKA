import java.util.Arrays;
import java.util.Scanner;

public class EIEVERYN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] num = new int[m];
            for (int j = 0; j < num.length; j++) {
                num[j] = sc.nextInt();
            }
            Arrays.sort(num);
            int expNum = 1;
            for (int k = 0; k < num.length; k++) {
                if (num[k] == expNum) {
                    expNum++;
                }
            }
            if (expNum > n)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        sc.close();
    }
}
