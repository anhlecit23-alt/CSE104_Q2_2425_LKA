import java.util.Scanner;

public class EIPOINT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        sc.close();
        ;
        int[] diem = new int[] { 90, 85, 80, 75, 70, 65, 60, 55, 53, 52, 50, 0 };
        String[] chu = new String[] { "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" };
        for (int i = 0; i < diem.length; i++) {
            if (s >= diem[i]) {
                System.out.println(chu[i]);
                break;
            }
        }

    }

}
