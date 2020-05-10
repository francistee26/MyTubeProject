public class MortgageCalculator {
    private int principal;
    private float annualInterest;
    private byte years;

    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    // Calculate mortgage
    public double calculateMortgage() {

        float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
        float numberOfPayments = (short) (years * Main.MONTHS_IN_YEAR);
        // calculates the mortgage
        double mortgage = ((principal) * ((monthlyInterest * Math.pow((1 + monthlyInterest), (numberOfPayments))))
                / ((Math.pow((1 + monthlyInterest), (numberOfPayments))) - 1));

        return mortgage;
    }

    // Calculate mortgage balance
    public double calculateRemainingMortgage(short numberOfPaymentsMade) {

        float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
        float numberOfPayments = (short) (years * Main.MONTHS_IN_YEAR);
        // calculates the mortgage balance
        double balance = ((principal) * (Math.pow((1 + monthlyInterest), numberOfPayments)
                - Math.pow((1 + monthlyInterest), numberOfPaymentsMade)))
                / (Math.pow((1 + monthlyInterest), numberOfPayments) - 1);

        numberOfPaymentsMade++;

        return balance;
    }

    public int getYears() {
        return years;
    }

}