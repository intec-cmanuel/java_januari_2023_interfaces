package be.intecbrussel.interfaces;

public class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("Consuming fuel to woosh");
    }

    @Override
    public void crash() {
        System.out.println("Fuel goes boom");
    }
}
