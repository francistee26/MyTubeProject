public class Main {
    public static void main(String[] args) {

        final int lowerLimiter = 1;
        final int upperLimiter = 30;

        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest: ", lowerLimiter, upperLimiter);
        byte years = (byte) Console.readNumber("Period (Years): ", lowerLimiter, upperLimiter);

        var calculator = new MortgageCalculator(principal, annualInterest, years);
        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();

    }
  
}