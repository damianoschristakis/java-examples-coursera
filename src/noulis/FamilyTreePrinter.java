package noulis;

public class FamilyTreePrinter {

    // Execution terminal
    public static void main(String args[]){
        new FamilyTreePrinter(); //inistantion
    }

    public FamilyTreePrinter() {
        this.printFamilyTree();
        this.printBastardFamilyTree();
    }

    public void printFamilyTree(){
        System.out.println("--- Familytree program ----");

        //Fotini
        Person fotini = new Person("Fotini", "Pashidou", false, 22); //instantiation (use of the constructor)
        fotini.setGender(1);
        System.out.println("Person1: "+ fotini);

        // Damianos
        Person damianos = new Person("Damianos", "Christakis", false, 26);
        damianos.setGender(0);
        System.out.println("Person2: "+ damianos);

        // Fictief mama
        Person fitctionMama = new Person("Rita", "Berdemeni", true, 60);
        fitctionMama.setGender(1);
        System.out.println("FictionMaaam: "+ fitctionMama);
    }

    public void printBastardFamilyTree(){
        System.out.println("--- Bastard program ----");

        //Fotini
        Person fotini = new Person("Katerini", "Pashidou", false, 22); //instantiation (use of the constructor)
        fotini.setGender(1);
        System.out.println("Person1: "+ fotini);

        // Damianos
        Person damianos = new Person("Michallis", "Pashidis", false, 26);
        damianos.setGender(0);
        System.out.println("Person2: "+ damianos);

        // Fictief mama
        Person fitctionMama = new Person("Bovari", "boveri", true, 60);
        fitctionMama.setGender(1);
        System.out.println("FictionMaaam: "+ fitctionMama);
    }

}
