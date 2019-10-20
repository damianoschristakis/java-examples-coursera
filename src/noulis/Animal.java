package noulis;

public class Animal {
    private String name;
    private String species;

    public Animal(String name) {this.setName(name);}

    public Animal(String name, String species) {
        this.setName (name);
        this.setSpecies (species);
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSpecies() { return species; }

    public void setSpecies(String species) { this.species = species; }
}

