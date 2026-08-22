package generics;

public class PairClient {
    public static void main(String[] args) {
        Pair<Integer, String> p = new Pair<>(232, "Ankit");
        System.out.println(p.x.getClass());
        Pair.print("Ankit");


    }
}
