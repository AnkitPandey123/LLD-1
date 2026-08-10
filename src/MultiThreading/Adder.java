package MultiThreading;

public class Adder implements Runnable{
    public void print()
    {
        System.out.println("I am Adder Class");
    }

    @Override
    public void run()
    {
        print();
    }

}
