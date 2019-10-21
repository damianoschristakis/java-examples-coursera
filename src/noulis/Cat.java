package noulis;

public class Cat extends Animal {
    private boolean isDivaCat;

    public Cat(String name) { super.setName(name);
    isDivaCat = true;
    }

    @Override
    String drink() {
        return "I'm a happy cat, miaaauw, good milk.";
    }

    @Override
    String fart() {
        return "pfiiiiiw";
    }

    public boolean isDivaCat() {
        return isDivaCat;
    }

    public void setDivaCat(boolean divaCat) {
        isDivaCat = divaCat;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
