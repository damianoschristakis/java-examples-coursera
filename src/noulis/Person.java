package noulis;

public class Person {
    private String firstname;
    private String lastname;
    private boolean married;
    private int age;
    private int gender; //0 = masculin; 1 = feminin

    public Person(String firstname) {
        this.setFirstname(firstname);
    }

    public Person(String firstname, String lastname, boolean married, int age) {
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.setMarried(married);
        this.setAge(age);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    //override toString method


    @Override
    public String toString() {
        // if (gender == 0) then "Mr." else "Miss." -> syntactic sugaring
        return ((this.gender == 0)? "Mr. ": ((this.married == true)? "Mme. ":"Miss. ")) + this.getFirstname() + " " + this.getLastname() + " - age: " + this.getAge() + " - is married: " + this.isMarried();
    }
}
