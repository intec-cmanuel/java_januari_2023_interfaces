package be.intecbrussel.PaymentApp;

public class Paypal implements PayAndCollectTool{
    private double moneyOnAccount;

    public Paypal(double moneyOnAccount) {
        this.moneyOnAccount = moneyOnAccount;
    }

    public void setMoneyOnAccount(double moneyOnAccount) {
        this.moneyOnAccount = moneyOnAccount;
    }

    public double getMoneyOnAccount() {
        return moneyOnAccount;
    }

    @Override
    public void pay(double amount) {
        moneyOnAccount -= amount;
    }

    @Override
    public void receiveMoney(double amount) {
        moneyOnAccount += amount;
    }
}
