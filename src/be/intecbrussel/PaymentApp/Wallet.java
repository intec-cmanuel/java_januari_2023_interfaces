package be.intecbrussel.PaymentApp;

public class Wallet implements PayAndCollectTool{
    private double moneyInWallet;

    public Wallet(double money) {
        this.moneyInWallet = money;
    }

    public void setMoneyInWallet(double moneyInWallet) {
        this.moneyInWallet = moneyInWallet;
    }

    public double getMoneyInWallet() {
        return moneyInWallet;
    }

    @Override
    public void pay(double amount) {
        moneyInWallet -= amount;
    }

    @Override
    public void receiveMoney(double amount) {
        moneyInWallet += amount;
    }

    @Override
    public void payMillionEuro() {
        pay(5);
    }
}
