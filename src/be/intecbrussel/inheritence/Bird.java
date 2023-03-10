package be.intecbrussel.inheritence;

import be.intecbrussel.interfaces.Flyable;

public class Bird extends Animal implements Flyable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("flap your wings.");
    }

    @Override
    public void crash() {
        System.out.println("Bird + window = stain");
    }
}
