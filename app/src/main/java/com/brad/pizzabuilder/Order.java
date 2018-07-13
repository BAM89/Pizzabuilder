package com.brad.pizzabuilder;
import java.util.ArrayList;

public class Order {
    public ArrayList<OrderItem> orderItems = new ArrayList<OrderItem>();
    private static final Order ourInstance = new Order();

    public static Order getInstance() {
        return ourInstance;
    }

    public void addItem(OrderItem orderItem){

    }

    public void removeItem(OrderItem orderItem){

    }
    public int getCount(){

        return 0;
    }
    public ArrayList<OrderItem> orderItemsLists(){
        return orderItems;
    }
    public void clearOrder(){

    }
    private Order() {
    }
}
