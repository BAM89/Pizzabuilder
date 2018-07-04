package com.brad.pizzabuilder;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    public CustomPi customPi;

    public MeatLovers buildMeatLovers(){
       return new MeatLovers(); //initializing meatLovers/new up
    }

    public Veggie buildVeggie(){
        return new Veggie(); //initializing Veggie pizza
    }

    public CustomPi buildCustom(ArrayList<Topping> toppings){
        customPi = new CustomPi();
        customPi.toppings = toppings;
        return customPi;

    }
}
