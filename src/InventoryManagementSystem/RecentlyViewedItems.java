package InventoryManagementSystem;

import java.util.LinkedList;

public class RecentlyViewedItems {

    private LinkedList<Item> rvi;

    public RecentlyViewedItems() {
        rvi = new LinkedList<>();
    }

    public void addRecentlyViewedItem(Item item)
    {
        rvi.remove(item);
        rvi.addLast(item);
        if(rvi.size() > 10) rvi.removeFirst();
    }

    public LinkedList<Item> getRvi() {
        return rvi;
    }
}
