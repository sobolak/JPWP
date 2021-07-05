package zad3;

import java.text.NumberFormat;

public class PrintingPayments {
    private final NumberFormat currency;
    private final MortgageCalculator calculator;

    public PrintingPayments(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printMortgage() {
        double wholePayment = calculator.calculateMortgage();
        System.out.println("\nMORTGAGE\n--------\nMonthly Payments: " + currency.format(wholePayment));
    }
    public void printPaymentSchedule() {
        System.out.println("\nPAYMENT SCHEDULE\n----------------");
        for (double payment : calculator.getRestOfPayment()) {
            System.out.println(currency.format(payment));
        }
    }
}