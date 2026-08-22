package solid;

public class Dove extends BirdWSolid implements Flyable{

    FlyAltitude flyAltitude;
    public Dove(String name, String color, FlyAltitude flyAltitude) {
        super(name, color);
        this.flyAltitude = flyAltitude;
    }

    @Override
    public void eat() {
        System.out.println("Dove is eating");
    }

    @Override
    public void fly() {
        flyAltitude.flyAltitude();
    }
}


/* Here we have seen Dependency Inversion,
instead Dove class directly dependent on any of HighFlyable or LowFlyable
it should depend upon interface which should be implemented by HighFlyable
and LowFlyable, so we need not to change the whole implementation we just
need to change the type of object FlyAltitude is taking.
 */
