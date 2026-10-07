public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int months = sc.nextInt();
        double priceHouse = sc.nextDouble();
        double interestRate = sc.nextDouble();
        double monthlyHouse[] = new double[8];
        double savingRate[] = new double[8];
        for (int i = 0; i < 8; i++) {
            monthlyHouse[i] = sc.nextDouble();
        }
        for (int i = 0; i < 8; i++) {
            savingRate[i] = sc.nextDouble();
        }
        double high = 1e17;
        double low = 0;
        double eps = 1e-3;
        double answer = 0;
        while (low + eps < high) {
            double mid = (low + high) / 2;
            if (findMonthly(mid, months, savingRate, monthlyHouse, priceHouse, interestRate)) {
                answer = mid;
                high = mid;
            } else {
                low = mid;
            }
        }
        System.out.println(Math.round(answer));
        sc.close();
    }

    public static boolean findMonthly(double monthly, int months, double[] savingRate, double[] monthlyHouse,
            double priceHouse, double interestRate) {
        int index = 0;
        boolean bought = false;
        double debt = 0;
        double saving = monthly;
        for (int i = 0; i < months; i++) {
            index = i / 60;
            if (!bought) {
                if (saving >= priceHouse * 0.3) {
                    bought = true;
                    debt = priceHouse - saving;
                }
                saving = saving * (1 + savingRate[index]) + monthly;
                priceHouse = priceHouse * (1 + monthlyHouse[index]);
            } else {
                debt = debt * (1 + interestRate);
                debt -= monthly;
                if (debt <= 1e-9) {
                    return true;
                }
            }
        }
        return bought && debt <= 1e-9;
    }
}
