package solid;

public  class Pegion extends BirdWSolid implements Flyable{

    public Pegion(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat()
    {
        System.out.println("Pegion is eating");
    }

    @Override
    public void fly() {
        System.out.println("Pegion is flying");
    }
}
