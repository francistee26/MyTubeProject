import java.text.NumberFormat;

public class MortgageReport {
    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    public void printMortgage() {
        // returned value of mortgage assigned to mortgage variable
        double mortgage = calculator.calculateMortgage();
        // formart mortgage to currency
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("\nMORTGAGE\n--------\nMonthly Payments: " + mortgageFormatted + "\n");
    }

    public void printPaymentSchedule() {
        System.out.println("PAYMENT SCHEDULE\n----------------");

        for (short month = 1; month <= calculator.getYears() * Main.MONTHS_IN_YEAR; month++) {
            double balance = calculator.calculateRemainingMortgage(month);

            // formart balance mortgage to currency and print to console
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

}