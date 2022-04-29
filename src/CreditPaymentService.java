public class CreditPaymentService {
    public double calculate(int creditAmount, double rateOfInterest, int loanTerm) {
        int monthLoanTerm = loanTerm * 12;
        double monthRateOfInterest = rateOfInterest / (100 * 12);
        double creditPayment = creditAmount * (monthRateOfInterest / (1 - Math.pow((1 + monthRateOfInterest), -monthLoanTerm)));
        return Math.round(creditPayment);
    }
}

