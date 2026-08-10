package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        Book b1 = new Book("1", "Atomic Habits", 23232, 2, "Christopher");
        Book b2 = new Book("2", "New Atomic Habits", 233232, 3, "Christopher Nolan");
        Book b3 = new Book("3", "Latest Atomic Habits", 232332, 4, "Christopher Pandey");
        List<Book> bl = new ArrayList<>();

        bl.add(b1);
        bl.add(b2);
        bl.add(b3);

        Collections.sort(bl);

        for(Book b : bl)
        {
            System.out.println(b.getName());
        }

        Inventory<Book> in = new Inventory<>();
        in.addItem(b1);
        in.addItem(b2);
        in.addItem(b3);



    }
}
