package com.brad.pizzabuilder;
import java.util.ArrayList;

public class CustomPi extends BasePizza{
    public CustomPi(){
        this.toppings = new ArrayList<Topping>();
        this.price = 07.00;
        this.crust = Crust.Plain;
        this.name = PizzaType.Custom;

    }

}
