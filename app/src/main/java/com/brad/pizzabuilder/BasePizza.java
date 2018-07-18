package com.brad.pizzabuilder;

import java.util.ArrayList;

public class BasePizza implements OrderItem {
    protected ArrayList<Topping> toppings;
    protected double price;
    protected Crust crust;
    protected PizzaType name;

    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    public double getPrice() {
        return price;
    }


    public Crust getCrust() {
        return crust;
    }

    public PizzaType getName() {
        return name;
    }

    public void addTopping(Topping topping) {
        price = price + topping.getPrice();
        toppings.add(topping);
    }
    public void removeTopping(Topping topping){
        price = price - topping.getPrice();
        toppings.remove(topping);
    }

    @Override
    public void NewItem() {

    }

    @Override
    public String newItem() {
        return null;
    }

    @Override
    public String getFinalName() {
        return null;
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }
}
