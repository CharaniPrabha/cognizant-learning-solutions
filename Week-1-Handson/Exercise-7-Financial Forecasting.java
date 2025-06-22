import java.util.*;

public class FinancialForecast {
    static Map<Integer, Double> memo = new HashMap<>();
    public static double forecastValue(double currentValue, double[] growthRates, int year) {
        if (year == 0) return currentValue;
        if (memo.containsKey(year)) return memo.get(year);
        double prev = forecastValue(currentValue, growthRates, year - 1);
        double futureValue = prev * (1 + growthRates[year - 1]);
        memo.put(year, futureValue);
        return futureValue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the current value (e.g., 1000): ₹");
        double currentValue = sc.nextDouble();
        System.out.print("Enter number of years to forecast: ");
        int n = sc.nextInt();
        double[] growthRates = new double[n];
        System.out.println("Enter growth rates for each year (as percentages, e.g., 5 for 5%):");
        for (int i = 0; i < n; i++) {
            System.out.printf("Year %d growth rate: ", i + 1);
            growthRates[i] = sc.nextDouble() / 100.0; 
        }
        double result = forecastValue(currentValue, growthRates, n);
        System.out.printf("Future value after %d years: ₹%.2f%n", n, result);
        sc.close();
    }
}