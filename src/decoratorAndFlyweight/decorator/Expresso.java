package decoratorAndFlyweight.decorator;

public class Expresso implements Coffee{
    @Override
    public int cost() {
        return 100;
    }

    @Override
    public String description() {
        return "Expresso";
    }
}
