package com.brad.pizzabuilder;
import java.util.ArrayList;
import android.widget.Toast;

public class Order {
    public ArrayList<OrderItem> orderItems = new ArrayList<OrderItem>();
    private static final Order ourInstance = new Order();
    protected double price;

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public double getPrice() {
        return price;
    }

    public static Order getInstance() {
        return ourInstance;
    }

    public void addItem(OrderItem orderItem){
        price = price + orderItem.getTotalPrice();
        orderItems.add(orderItem);

    }

    public void removeItem(OrderItem orderItem){
        price = price - orderItem.getTotalPrice();
        orderItems.remove(orderItem);
    }
    public int getCount(){

        return orderItems.size();
    }
    public ArrayList<OrderItem> orderItemsLists(){
        return orderItems;
    }
    public void clearOrder(){


    }
    private Order() {
    }
}
