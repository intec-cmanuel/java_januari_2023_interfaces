package be.intecbrussel.PaymentApp;

public interface PaymentTool {
    void pay(double amount);

    default void hello(){
        System.out.println("Hello class");
    }

    default void payMillionEuro() {
        pay(1_000_000);
    }

    static void getDescription() {
        System.out.println("I am a payment tool.");
    }
}
