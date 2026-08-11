package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args) {

//        Book b1 = new Book("1", "Atomic Habits", 23232, 2, "Christopher");
//        Book b2 = new Book("2", "New Atomic Habits", 233232, 3, "Christopher Nolan");
//        Book b3 = new Book("3", "Latest Atomic Habits", 232332, 4, "Christopher Pandey");
//        List<Book> bl = new ArrayList<>();
//
//        bl.add(b1);
//        bl.add(b2);
//        bl.add(b3);
//
//        Collections.sort(bl);
//
//        for(Book b : bl)
//        {
//            System.out.println(b.getName());
//        }
//
//        Inventory<Book> in = new Inventory<>();
//        in.addItem(b1);
//        in.addItem(b2);
//        in.addItem(b3);

        // M1

        Item i1 = new Book("Atomic Habits", 210, 5, "Nelson");
        Item i2 = new Electronics("Fan", 500, 5, 2);
        Item i3 = new Clothing("Pajamas", 300, 3, "S");

        System.out.println(i1.getId());
        System.out.println(i2.getId());
        System.out.println(i3.getId());

        // M2

        Book b1 = new Book("Atomic Habits Version 1", 210, 5, "Nelson");
        Book b2 = new Book("Atomic Habits Version 2", 210, 5, "Nelson");
        Inventory<Book> inventoryOfBook = new Inventory<>();
        inventoryOfBook.addItem(b1);
        inventoryOfBook.addItem(b2);
        inventoryOfBook.addItem(b2);
       // inventoryOfBook.removeItem("id-4");
        List<Book> lb = inventoryOfBook.getAllItems();
        for(Book b : lb)
        {
            System.out.println(b.getName());
        }
       // System.out.println(inventoryOfBook.getItem("id-5").getName());






    }
}
