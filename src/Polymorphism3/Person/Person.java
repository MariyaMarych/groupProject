package Polymorphism3.Person;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void info(){
        System.out.println("Name: "+this.name);
    }

    // person p1  = new Person();
    //person
    //p1.hasName(newPerson());
    //p1.
    public boolean hasSameName(Person otherPerson){
        return this.getName().equalsIgnoreCase(otherPerson.getName());

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
