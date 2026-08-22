package solid;

public abstract class BirdWSolid {

    String name;
    String color;

    public BirdWSolid(String name, String color) {
        this.name = name;
        this.color = color;
    }

   // public abstract void fly();

    public abstract void eat();
}

/*
Creating this class abstract and it's method fly abstract made it's child class SRP eligible
as it's just doing one work for pegion or crow and they  only have one reason to changes
whenever pegion or crow changes, and making it also made it OCP compliant because
now this class is not required to modified and can only be extended.

Issue with it :

As penguin is a bird, so it also extends this bird class and as it do not fly
it also have to give implementation to fly method which it do not required
and if some client is using it, they call it fly which is not right. Here comes
3rd principle i.e. Liskov's Substitution principle which says child class can be
easy replaced by parent class or say child class must follow all implementation of
parent class, but here it's breaking as penguin will not follow this principle
So just put only generic method into method class and make interace like flyable
as not all birds fly, so which ever fly just implements it. This issue can be solved by
taking out fly from here as fly is not the thing which all birds are doing.

--> Interface Segregation saying interface should have as less method as possible,
perferably 1, not more than 3, because implementing class otherwise should
have to implement all method that they don't want.

--> Dependency Inversion :
A class should not depend directly on a concrete class,
 */
