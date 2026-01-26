import java.util.Scanner;

public class EIUBIRTH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long b = sc.nextLong();

            long r = sc.nextLong();
            long x = sc.nextLong(); // blue
            long y = sc.nextLong(); // red
            long z = sc.nextLong(); // change
            long blue = Math.min(x, y + z);
            long red = Math.min(y, x + z);
            System.out.println(blue * b + red * r);
        }
        sc.close();
    }
}
