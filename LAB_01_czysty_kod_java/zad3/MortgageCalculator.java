package zad3;

public class MortgageCalculator {
    private final static byte month = 12;
    private final static byte percent = 100;

    private final DatabaseOfMortage mortgageProperties;
    private final float monthlyInterest;
    private final short numberOfPayments;

    public MortgageCalculator(DatabaseOfMortage databaseOfMortage) {
        this.mortgageProperties = databaseOfMortage;
        this.monthlyInterest = getMonthlyInterest();
        this.numberOfPayments = getNumberOfPayments();
    }

    public double calculateMortgage() {
        return mortgageProperties.getPrincipal()
                * monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        return mortgageProperties.getPrincipal()
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public double[] getRestOfPayment() {
        var balances = new double [getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++) {
            balances[month - 1] = calculateBalance(month);
        }
        return balances;
    }

    private float getMonthlyInterest() {
        return mortgageProperties.getAnnualInterest() / percent / month;
    }

    private short getNumberOfPayments() {
        return (short) (mortgageProperties.getYears() * month);
    }
}
