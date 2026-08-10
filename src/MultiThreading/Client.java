package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        System.out.println("Hello from main" + Thread.currentThread().getName());
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Cores : " + cores);
        ExecutorService s = Executors.newCachedThreadPool();

        for(int i=1;i<=1;i++)
        {
            NumberPrinter num = new NumberPrinter(i);
            s.execute(num);
        }
        s.shutdown();

        System.out.println("Bye from main" + Thread.currentThread().getName());

    }
}
