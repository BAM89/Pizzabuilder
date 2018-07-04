package com.brad.pizzabuilder;

public abstract class Topping implements ITopping{
    @Override
   public abstract String getImage();

    @Override
    public abstract String getName();

    @Override
    public abstract double getPrice();

}
