public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditAmount = 1_000_000; // в рублях
        double rateOfInterest = 9.99; // в %
        int loanTerm = 1; // в годах

        double creditPayment = service.calculate(creditAmount, rateOfInterest, loanTerm);
        System.out.println("Размер ежемесячного платежа: " + creditPayment);

        loanTerm = 2;
        creditPayment = service.calculate(creditAmount, rateOfInterest, loanTerm);
        System.out.println("Размер ежемесячного платежа: " + creditPayment);

        loanTerm = 3;
        creditPayment = service.calculate(creditAmount, rateOfInterest, loanTerm);
        System.out.println("Размер ежемесячного платежа: " + creditPayment);
    }
}
