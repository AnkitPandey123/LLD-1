package Generics;

public class Animal extends Creature{
    String Name;

    public Animal(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
