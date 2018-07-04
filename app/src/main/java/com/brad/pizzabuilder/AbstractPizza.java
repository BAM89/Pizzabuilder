package com.brad.pizzabuilder;

import java.util.List;

public abstract class AbstractPizza {

   public abstract List<Topping> getToppings();
   public abstract double getPrice();
   public abstract Crust getCrust();
   public abstract PizzaType getName();
   public abstract void addTopping(Topping topping);



}
