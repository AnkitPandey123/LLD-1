package decoratorAndFlyweight.decorator;

public class IceCream extends CoffeeDecorator{
    public IceCream(Coffee wrapper) {
        super(wrapper);
    }

    @Override
    public int cost() {
        return wrapper.cost() + 500;
    }

    @Override
    public String description() {
        return   wrapper.description() + " + ICECREAM";
    }
}
