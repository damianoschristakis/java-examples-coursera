package noulis;

import java.util.ArrayList;
import java.util.List;

public class FamilyTreePrinter<species> {

    // Execution terminal
    public static void main(String args[]) {
        new FamilyTreePrinter(); //inistantion
    }

    public FamilyTreePrinter() {
        // this.printFamilyTree();
        //this.printBastardFamilyTree();
        //this.testPets();
        this.petsOfFamily();

    }

    private void petsOfFamily() {
        //Fotini has cat with name Psonia
        Person fotini = new Person("Fotini", "Pashidou", false, 22); //instantiation (use of the constructor)
        fotini.setGender(1);
        Cat psonia = new Cat("psonia");
        List<Animal> fotiniPetList = new ArrayList<Animal>();
        fotiniPetList.add(psonia);
        fotini.setPets(fotiniPetList);
        System.out.println("Fotini summary: "+fotini);


        Person damianos = new Person("Damianos", "Christakis", false, 26);
        damianos.setGender(0);
        Dog raf = new Dog("Raf");
        Cat minou = new Cat("Minou");
        List<Animal> noulisPetList = new ArrayList<>();
        noulisPetList.add(raf);
        noulisPetList.add(minou);
        damianos.setPets(noulisPetList);
        System.out.println("Damianos summary: "+ damianos);


    }

    private void printFamilyTree() {
        System.out.println("--- Familytree program ----");

        //Fotini has cat with name Psonia
        Person fotini = new Person("Fotini", "Pashidou", false, 22); //instantiation (use of the constructor)
        fotini.setGender(1);
        System.out.println("Person1: " + fotini);
        System.out.println("Version: " + fotini.version());
        System.out.println("Version: " + Person.version());
        
        // Damianos has 1 dogs with names Raf and 1 cat Minou
        Person damianos = new Person("Damianos", "Christakis", false, 26);
        damianos.setGender(0);
        System.out.println("Person2: " + damianos);

        // Fictief mama - has no animals
        Person fitctionMama = new Person("Rita", "Berdemeni", true, 60);
        fitctionMama.setGender(1);
        System.out.println("FictionMaaam: " + fitctionMama);
    }

    private void printBastardFamilyTree() {
        System.out.println("--- Bastard program ----");

        //Fotini
        Person fotini = new Person("Katerini", "Pashidou", false, 22); //instantiation (use of the constructor)
        fotini.setGender(1);
        System.out.println("Person1: " + fotini);

        // Damianos
        Person damianos = new Person("Michallis", "Pashidis", false, 26);
        damianos.setGender(0);
        System.out.println("Person2: " + damianos);

        // Fictief mama
        Person fitctionMama = new Person("Bovari", "boveri", true, 60);
        fitctionMama.setGender(1);
        System.out.println("FictionMaaam: " + fitctionMama);

    }

    private void testPets(){
        Cat psonia = new Cat("psonia");
        Dog jeffy = new Dog("Jeffy");
        Parrot squeezy = new Parrot("Squeezy");
/*        System.out.println("Psonia cat: " + psonia);
        System.out.println("Jeffy dog: " + jeffy);
        System.out.println("Psonia farts: " + psonia.fart());
        System.out.println("Jeffy farts: " + jeffy.fart());*/

        Animal petArray [] = {psonia, jeffy, squeezy};

        //print all names of my animals

        for (Animal animal : petArray) {
            System.out.println("My name is: " + animal.getName());
            System.out.println("Ready to fart: " + animal.fart());
            // is the animal a dog? if yes -> verify if he's snorking
            if(animal instanceof Dog) System.out.println("It's a dog and check if snorking: "+ ((Dog) animal).isSnorksAtNight());
        }
    }

}
