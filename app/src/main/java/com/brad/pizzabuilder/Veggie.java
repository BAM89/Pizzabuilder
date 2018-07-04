package com.brad.pizzabuilder;
import java.util.List;
import java.util.ArrayList;

public class Veggie extends BasePizza {
    public Veggie(){
        this.toppings = new ArrayList<Topping>();
        this.price = 07.00;
        this.crust = Crust.Plain;
        this.name = PizzaType.Veggie;
        this.addTopping(new Garlic());
        this.addTopping(new Mushroom());
        this.addTopping(new Olives());
        this.addTopping(new Onions());
        this.addTopping(new Pineapple());
        this.addTopping(new Spinach());

    }
}
