package solid;

public class Crow extends BirdWSolid implements Flyable{

    public Crow(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat()
    {
        System.out.println("Crow is eating");
    }

    @Override
    public void fly() {
        System.out.println("Crow is flying");
    }
}
