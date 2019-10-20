package noulis;

public class Parrot extends Animal {
    public Parrot(String name) {
        super.setName(name);
    }

    @Override
    String drink() {
        return "Parrotly juice";
    }

    @Override
    String fart() {
        return "I never fart, only shit preferably out of my cage";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
