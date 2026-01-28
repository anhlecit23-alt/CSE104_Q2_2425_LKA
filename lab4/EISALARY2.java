import java.util.Scanner;

public class EISALARY2 {
    public static void main(String[] args) {
        // variable names need to be changed for clarity, paying attention to decimal
        // formatting
        // rounding, line breaks, and data types.
        // variable name uses camelCase naming convention
        // code is properly indented to improve readability
        Scanner sc = new Scanner(System.in);
        int employee = sc.nextInt(); // number of employees
        // variable name is meaningful and avoids abbreviations
        double totalNormalPay = 0; // wage of regular hour pay
        double totalOverTimePay = 0; // wage of OT pay
        double totalNormalHour = 0; // regular hour, each<=8
        double totalOvertimeHours = 0;// overtime hour, >8
        while (employee-- > 0) {
            double sal = 0; // total salary for one employee
            double[] a = new double[5]; // fixed numbers of working days
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextDouble(); // input number of hours in each day

            }
            double wage = sc.nextDouble(); // wage of that employee
            for (int i = 0; i < a.length; i++) {
                if (a[i] <= 8) { // regular working hour
                    sal += a[i] * wage; // hours x wage
                    totalNormalPay += a[i] * wage; // add up each person's daily wages not OT
                    totalNormalHour += a[i]; // add up each person's daily hours not OT
                } else {
                    sal += 8 * wage + (a[i] - 8) * wage * 1.5; // 8 is the regular working hour, a[i]- 8 is OT
                    totalNormalPay += 8 * wage; // add up each person's daily wages not OT
                    totalNormalHour += 8;// add up each person's daily hours not OT
                    totalOverTimePay += (a[i] - 8) * wage * 1.5; // OT is calculated by 1.5 time more than normal
                    totalOvertimeHours += a[i] - 8;// total OT hours
                }
            }

            System.out.printf("%.2f\n", sal); // round to two decimal places

        }
        if (totalNormalHour == 0) {
            System.out.printf("%.2f\n", 0.0);// standardize data types
        } else {
            System.out.printf("%.2f\n", totalNormalPay / totalNormalHour); // the average salary per office hour
        }
        if (totalOvertimeHours == 0) {
            System.out.printf("%.2f\n", 0.0);
        } else {
            System.out.printf("%.2f\n", totalOverTimePay / totalOvertimeHours);// the average salary per hour overtime
        }
        sc.close();
    }
}
