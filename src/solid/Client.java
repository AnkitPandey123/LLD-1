package solid;

public class Client {

    public static void flyBirds(Flyable birds)
    {
        birds.fly();
    }
    public static void main(String[] args) {

        BirdWOSolid penguin = new BirdWOSolid("pen", BirdType.Penguin, "black");
        penguin.fly();

        Flyable pegion = new Pegion("p1", "white");
        flyBirds(pegion);

        Flyable crow = new Crow("c1", "black");
        flyBirds(crow);

        BirdWSolid penguin1 = new Penguin("p1", "grey");

        Flyable dove = new Dove("d1", "white", new LowFlyable());
        dove.fly();

        BirdType b = BirdType.Pegion;




    }
}
