package noulis;

abstract class Animal {
    // Properties
    private String name;

    // Methods
    abstract String drink();
    abstract String fart();

    // public => accessible in all your packages
    // private => only accessible in your root package
    // protected => only accessible in your inherited classes in your package
    protected String getName() { return name; }
    protected void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "I'm an animal and my name is: " + name + " and when I fart: " + this.fart();
    }
}

