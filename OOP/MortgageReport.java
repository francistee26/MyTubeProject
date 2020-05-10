import java.text.NumberFormat;

public class MortgageReport {
    private MortgageCalculator calculator;
    private NumberFormat currency;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printMortgage() {
        // returned value of mortgage assigned to mortgage variable
        double mortgage = calculator.calculateMortgage();
        // formart mortgage to currency
        String mortgageFormatted = currency.format(mortgage);
        System.out.println("\nMORTGAGE\n--------\nMonthly Payments: " + mortgageFormatted + "\n");
    }

    // formart balance mortgage to currency and print to console
    public void printPaymentSchedule() {
        System.out.println("PAYMENT SCHEDULE\n----------------");
        for (double balance : calculator.getRemainingBalances())
            System.out.println(currency.format(balance));

    }

}