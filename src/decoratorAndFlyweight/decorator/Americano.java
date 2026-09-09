package decoratorAndFlyweight.decorator;

public class Americano implements Coffee{
    @Override
    public int cost() {
        return 50;
    }

    @Override
    public String description() {
        return "Americano";
    }
}
