package noulis;

public class AgeOfConstruction extends Buildings {
    private String AgeOfConstruction

    public AgeOfConstruction(String name, String ageOfConstruction) { super(name);
        AgeOfConstruction = ageOfConstruction;
    }

    public String getAgeOfConstruction() { return AgeOfConstruction; }

    public void setAgeOfConstruction(String ageOfConstruction) { AgeOfConstruction = ageOfConstruction;}

    public String toString() { return "This building is here from: " + AgeOfConstruction ;}
}
