public class Main {
    static final byte MONTHS_IN_YEAR = 12;
    static final byte PERCENT = 100;

    public static void main(String[] args) {

        final int lowerLimiter = 1;
        final int upperLimiter = 30;

        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest: ", lowerLimiter, upperLimiter);
        byte years = (byte) Console.readNumber("Period (Years): ", lowerLimiter, upperLimiter);

        var calculator = new MortgageCalculator(principal, annualInterest, years);

        new MortgageReport(calculator).printMortgage();
        new MortgageReport(calculator).printPaymentSchedule();

    }

}