import java.util.Scanner;

public class EITAX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble(); // salary Beo receives each month before tax
        double tax = 0; // total tax to pay
        double[] level = new double[] { 5_000_000, 5_000_000, 8_000_000, 14_000_000, 20_000_000, 28_000_000,
                Double.MAX_VALUE }; // taxableLevels
        double[] rate = new double[] { 0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35 }; // rates of each amount
        if (salary <= 9_000_000) {// personal relief
            tax = 0;
        } else {
            salary -= 9_000_000; // taxable salary
            for (int i = 0; i < rate.length && salary > 0; i++) {
                double amount = Math.min(salary, level[i]); // Compare two amounts
                tax += amount * rate[i]; // taxes by rates
                salary -= amount; // minus after calculate
            }
        }
        System.out.println(Math.round(tax)); // round to integer
    }
}
