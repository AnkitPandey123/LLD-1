package generics;

import java.util.ArrayList;
import java.util.List;

public class Client2 {

    public static void main(String[] args) {

        Dog nd = new Dog("normalDog");
        List<Dog> d = new ArrayList<>();
        d.add(new Dog("d1"));
        d.add(new Dog("d2"));
        print(d);
    }

    public static void print(List<? extends Animal> a){
        for(Animal al : a)
        {
            System.out.println(al.getName());
        }
    }
}
