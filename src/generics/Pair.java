package generics;

public class Pair<K, V> {

     K x;
     V y;

    public Pair()
    {

    }
    public Pair(K x, V y) {
        this.x = x;
        this.y = y;
    }

    public K getX() {
        return x;
    }

    public void setX(K x) {
        this.x = x;
    }

    public V getY() {
        return y;
    }

    public void setY(V y) {
        this.y = y;
    }

    public static <S> void print(S x)
    {
        System.out.println(x);
    }
}
