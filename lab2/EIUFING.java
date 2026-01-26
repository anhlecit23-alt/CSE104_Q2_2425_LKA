import java.util.Scanner;

public class EIUFING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ngon = new String[] { "cai", "tro", "giua", "ap ut", "ut" };
        int n = sc.nextInt();
        int result = n % 18;
        if (result > 10)
            result = 20 - result;
        if (result > 5) {// ban tay phai
            result = 11 - result;
            System.out.println("Ngon " + ngon[result - 1] + " cua ban tay phai");

        } else if (result == 0) {
            System.out.println("Ngon tro cua ban tay trai");
        } else {
            System.out.println("Ngon " + ngon[result - 1] + " cua ban tay trai");
        }
        sc.close();
    }
}
