package zad3;

public class Main {

    public static void main(String[] args) {

        DatabaseOfMortage databaseOfMortage = mortgageData();
        var calculateMonthlyMortgage = new MortgageCalculator(databaseOfMortage);
        var payments = new PrintingPayments(calculateMonthlyMortgage);

        payments.printMortgage();
        payments.printPaymentSchedule();
    }

    public static DatabaseOfMortage mortgageData() {

        int principal = (int) CollectingInputData.inputData("Principal", 1000, 1_000_000);
        float annualInterest = (float) CollectingInputData.inputData("Annual Interest Rate (In Percent)", 1, 30);
        byte years = (byte) CollectingInputData.inputData("Period (In Years)", 1, 30);
        return new DatabaseOfMortage(principal, annualInterest, years);
    }
}
