package be.intecbrussel;

import be.intecbrussel.PaymentApp.CreditCard;
import be.intecbrussel.PaymentApp.PaymentTool;
import be.intecbrussel.PaymentApp.Paypal;
import be.intecbrussel.PaymentApp.Wallet;

public class Main {
    public static void main(String[] args) {
        PaymentTool.getDescription();

        Paypal myPaypal = new Paypal(1000000);
        Wallet myWallet = new Wallet(10);
        CreditCard creditCard = new CreditCard(10);

        myWallet.pay(5);
        myWallet.receiveMoney(1.40);

//        System.out.println(myWallet.getMoneyInWallet());


        PaymentTool paymentTool = new Paypal(100);
        Wallet superFullWallet = new Wallet(4.50);
        buySandwich(paymentTool);
        buySandwich(superFullWallet);

        if (paymentTool instanceof Paypal) {
            System.out.println("Paypal: " + ((Paypal) paymentTool).getMoneyOnAccount());
        } else if (paymentTool.getClass().equals(Wallet.class)) { // Dit moeten jullie niet kennen
            System.out.println("Wallet: " + ((Wallet) paymentTool).getMoneyInWallet());
        }
    }

    public static void buySandwich(PaymentTool paymentTool) {
        paymentTool.hello();
        double price = 3.60;
        paymentTool.pay(price);
        System.out.println("Enjoy your sandwich");
    }
}