package InventoryManagementSystem;

import java.util.PriorityQueue;

public class OrderProcessing{

    PriorityQueue<Order> pq;

    public OrderProcessing() {
        this.pq = new PriorityQueue<>();
    }

    public void addOrder(Order order)
    {
        pq.add(order);
    }

    public Order  processOrder()
    {
        return pq.poll();
    }


}
