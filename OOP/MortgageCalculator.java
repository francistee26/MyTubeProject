public class MortgageCalculator {
    private int principal;
    private float annualInterest;
    private byte years;
    private static final byte PERCENT = 100;
    private static final byte MONTHS_IN_YEAR = 12;

    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    // Calculate mortgage
    public double calculateMortgage() {

        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();
        // calculates the mortgage
        double mortgage = ((principal) * ((monthlyInterest * Math.pow((1 + monthlyInterest), (numberOfPayments))))
                / ((Math.pow((1 + monthlyInterest), (numberOfPayments))) - 1));

        return mortgage;
    }

    // Calculate mortgage balance
    public double calculateRemainingMortgage(short numberOfPaymentsMade) {

        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();
        // calculates the mortgage balance
        double balance = ((principal) * (Math.pow((1 + monthlyInterest), numberOfPayments)
                - Math.pow((1 + monthlyInterest), numberOfPaymentsMade)))
                / (Math.pow((1 + monthlyInterest), numberOfPayments) - 1);

        numberOfPaymentsMade++;

        return balance;
    }

    public double[] getRemainingBalances() {
        var balance = new double[getNumberOfPayments()];
        for (short month = 1; month <= balance.length; month++)
            balance[month - 1] = calculateRemainingMortgage(month);

        return balance;

    }

    private short getNumberOfPayments() {
        return (short) (years * MortgageCalculator.MONTHS_IN_YEAR);      
    }

    private float getMonthlyInterest() {
        return annualInterest / MortgageCalculator.PERCENT / MortgageCalculator.MONTHS_IN_YEAR;
    }
}