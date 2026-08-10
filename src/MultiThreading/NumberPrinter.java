package MultiThreading;

public class NumberPrinter implements Runnable{
    private int num;
    NumberPrinter(int num)
    {
        this.num = num;
    }

    public void printNum()
    {
            System.out.println(num + " Current thread : " + Thread.currentThread().getName());

    }
    @Override
    public void run() {
        printNum();

    }
}
