package solid;

public class BirdWOSolid {

    String name;
    BirdType type;
    String color;

    public BirdWOSolid(String name, BirdType type, String color) {
        this.name = name;
        this.type = type;
        this.color = color;
    }

    public void fly()
    {
        if(type.equals(BirdType.Crow))
        {
            System.out.println("Pigeon is flying");
        }
        else if(type.equals("rhino"))
        {
            System.out.println("Ostrich is flying");
        }
        else if(type.equals(BirdType.Penguin))
        {
            System.out.println("Can't fly");
        }
        else
        {
            System.out.println("Sorry that much bird is only supported");
        }
    }
}

/* This class is breaking SRP as it's method fly is doing fly for too many birds
 --> SRP says class has only one reason to change, but here whenever need bird
comes it will change and also it can change for n no. of birds, which is breaking SRP.
Also concurrent development becomes slower as for penguin and say pegion, for both
need to change in this class, which might leads to conflicts.

--> It's also breaking OCP(Open Close Principle), it say class is only open for extension
but close for modification, but here it's not we are doing modification and doing
modification at one place for many other reasons.

For both of the above fix is create Bird abstract and also make it's fly method abstract,
and which ever birds comes it should inherit Bird, which will resolve SRP, because whenever
penguin needs changes, we can directly go to penguin  class, and making it abstract
also make it close for modification because whenever new bird comes we only do extension.
 */
