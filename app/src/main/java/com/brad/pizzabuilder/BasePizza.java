package com.brad.pizzabuilder;

import java.util.ArrayList;
import java.util.List;

public class BasePizza extends AbstractPizza {
    protected ArrayList<Topping> toppings;
    protected double price;
    protected Crust crust;
    protected PizzaType name;

    @Override
    public ArrayList<Topping> getToppings() {
        return toppings;

    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public Crust getCrust() {
        return crust;
    }

    @Override
    public PizzaType getName() {
        return name;
    }

    @Override
    public void addTopping(Topping topping) {
        price = price + topping.getPrice();
        toppings.add(topping);
    }
}
