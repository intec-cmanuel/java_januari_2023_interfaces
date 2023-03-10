package be.intecbrussel.inheritence;

public class Reptiles extends Animal{
    private String hissSound;

    public Reptiles(String name) {
        super(name);
    }

    public void setHissSound(String hissSound) {
        this.hissSound = hissSound;
    }

    public String getHissSound() {
        return hissSound;
    }

}
