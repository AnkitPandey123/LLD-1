package generics;

import java.util.ArrayList;
import java.util.List;

public class NumberClient {
    public static void main(String[] args) {
        List<Number> i = new ArrayList<>();
        i.add(1);
        i.add(2);
        print(i);

    }

    public static void print(List<? super Integer> n)
    {
        n.add(2);
    }
}
