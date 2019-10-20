package noulis;

public class Dog extends Animal {
    private boolean snorksAtNight;

    public Dog(String name) {
        super.setName(name);
        snorksAtNight = false;
    }

    @Override
    String drink() {
        return "I'm a crazy dog drinking some water.";
    }

    @Override
    String fart() {
        return "Doggy Pwoooot";
    }

    public boolean isSnorksAtNight() {
        return snorksAtNight;
    }

    public void setSnorksAtNight(boolean snorksAtNight) {
        this.snorksAtNight = snorksAtNight;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
