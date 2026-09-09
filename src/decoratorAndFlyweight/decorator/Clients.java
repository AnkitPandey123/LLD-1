package decoratorAndFlyweight.decorator;

public class Clients {

    public static void main(String[] args) {

        Coffee americano = new Americano();
        americano = new Moca(americano);
        americano = new Moca(americano);
        americano = new IceCream(americano);
        americano = new IceCream(americano);
        americano = new Moca(americano);
        System.out.println(americano.cost());
        System.out.println(americano.description());
    }
}
