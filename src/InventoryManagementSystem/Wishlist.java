package InventoryManagementSystem;

import java.util.HashSet;
import java.util.Set;

public class Wishlist {

    Set<Item> wishlist;

    public Wishlist()
    {
        this.wishlist = new HashSet<>();
    }

    public void addToWishlist(Item item)
    {
        wishlist.add(item);
    }

    public void removeFromWishlist(Item item)
    {
        wishlist.remove(item);
    }
}
