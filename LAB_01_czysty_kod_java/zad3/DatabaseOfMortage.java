package zad3;

public class DatabaseOfMortage {
    private int principal;
    private float annualInterest;
    private byte years;

    public DatabaseOfMortage(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public void setMortgageProperties(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public int getPrincipal() {
        return principal;
    }

    public float getAnnualInterest() {
        return annualInterest;
    }

    public byte getYears() {
        return years;
    }
}