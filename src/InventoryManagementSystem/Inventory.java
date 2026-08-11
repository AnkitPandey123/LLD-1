package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory<T extends Item> {

    HashMap<String, T> inventory;

    public Inventory() {
        this.inventory = new HashMap<>();
    }

    public void addItem( T item)
    {
        inventory.put(item.getId(), item);
    }

    public void removeItem(String id)
    {
        inventory.remove(id);
    }

    public T getItem(String id)
    {
            return inventory.get(id);
    }

    public List<T> getAllItems()
    {
        return new ArrayList<>(inventory.values());
    }

//    public List<T> filterByPriceRange(double minPrice, double maxPrice)
//    {
//        // Loop over hashmap
//    }
//
//    public List<T> filterByAvailability()
//    {
//        // can use binary search on hasmap
//    }
}
