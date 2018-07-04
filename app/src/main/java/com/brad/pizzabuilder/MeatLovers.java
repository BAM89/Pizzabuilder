package com.brad.pizzabuilder;
import java.util.List;
import java.util.ArrayList;

public class MeatLovers extends BasePizza {
    public MeatLovers(){
        //functions
        this.toppings = new ArrayList<Topping>();
        this.price = 07.00;
        this.crust = Crust.Plain;
        this.name = PizzaType.Meat;
        this.addTopping(new Sausage());
        this.addTopping(new Chicken());
        this.addTopping(new CanadianBacon());
        this.addTopping(new Hamburger());
        this.addTopping(new Pepperoni());


    }

}
