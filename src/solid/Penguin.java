package solid;

public class Penguin extends BirdWSolid{


    public Penguin(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("Penguin eating");
    }

}
