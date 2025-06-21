package paack;

public class FinancialForecast {

    public static double forecastValue(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }
        return forecastValue(principal, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double principal = 10000;
        double rate = 0.05; // 5% annual growth
        int years = 5;

        double futureValue = forecastValue(principal, rate, years);
        System.out.printf("Future Value after %d years: %.2f\n", years, futureValue);
    }
}
