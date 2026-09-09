package decoratorAndFlyweight.decorator;

public class Moca extends CoffeeDecorator{
    public Moca(Coffee wrapper) {
        super(wrapper);
    }

    @Override
    public int cost() {
        return wrapper.cost()+200;
    }

    @Override
    public String description() {
        return wrapper.description() + " + MOCA";
    }
}
