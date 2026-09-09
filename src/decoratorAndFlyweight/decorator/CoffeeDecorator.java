package decoratorAndFlyweight.decorator;

public abstract class CoffeeDecorator implements Coffee{

    Coffee wrapper;

    public CoffeeDecorator(Coffee wrapper) {
        this.wrapper = wrapper;
    }
}
