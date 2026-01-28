import java.util.Scanner;

public class EIGROSS2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double netSalary = sc.nextDouble();
        if (netSalary <= 11_000_000) {
            System.out.println(Math.round(netSalary));
            return;

        }
        double taxableIncome = netSalary - 11_000_000;
        double tax = 0;
        if (taxableIncome <= 4_750_000) {
            tax = taxableIncome / 0.95;
        } else if (taxableIncome <= 9_250_000) {
            tax = 5_000_000 + (taxableIncome - 4_750_000) / 0.9;
        } else if (taxableIncome <= 16_050_000) {
            tax = 10_000_000 + (taxableIncome - 9_250_000) / 0.85;
        } else if (taxableIncome <= 27_250_000) {
            tax = 18_000_000 + (taxableIncome - 16_050_000) / 0.8;
        } else if (taxableIncome <= 42_250_000) {
            tax = 32_000_000 + (taxableIncome - 27_250_000) / 0.75;
        } else if (taxableIncome <= 61_850_000) {
            tax = 52_000_000 + (taxableIncome - 42_250_000) / 0.7;
        } else {
            tax = 80_000_000 + (taxableIncome - 61_850_000) / 0.65;
        }
        System.out.println(Math.round(tax + 11_000_000));
        sc.close();
    }
}
