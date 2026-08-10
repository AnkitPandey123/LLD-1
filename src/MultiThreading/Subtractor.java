package MultiThreading;

public class Subtractor implements Runnable{
    public void print()
    {
        System.out.println("I am Subtractor class");
    }

    @Override
    public void run()
    {
        print();
    }
}
