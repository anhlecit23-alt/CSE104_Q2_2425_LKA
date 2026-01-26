import java.util.Scanner;

public class EISNAIL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();
        sc.close();
        int days = (int) (Math.ceil((v - a) / (double) (a - b) + 1));
        System.out.println(days);
    }

}
