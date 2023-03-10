package be.intecbrussel.PaymentApp;

public class CreditCard implements PaymentTool{
    private double debt;
    private double limit;

    public CreditCard(double limit) {
        debt = 0;
        this.limit = limit;
    }

    public double getDebt() {
        return debt;
    }

    public double getLimit() {
        return limit;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public void pay(double amount) {
        if (debt + amount > limit) {
            System.out.println("Insufficient funds");
        } else {
            debt += amount;
        }
    }
}
