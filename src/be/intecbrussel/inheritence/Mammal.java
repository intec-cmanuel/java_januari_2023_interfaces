package be.intecbrussel.inheritence;

public class Mammal extends Animal{
    public double amountOfMilkStoredInLiter;

    public Mammal(String name) {
        super(name);
    }

    public void setAmountOfMilkStoredInLiter(double amountOfMilkStoredInLiter) {
        this.amountOfMilkStoredInLiter = amountOfMilkStoredInLiter;
    }

    public double getAmountOfMilkStoredInLiter() {
        return amountOfMilkStoredInLiter;
    }
}
