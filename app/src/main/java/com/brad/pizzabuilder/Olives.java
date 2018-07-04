package com.brad.pizzabuilder;

public class Olives extends Topping {

    public String image;
    public String name;
    public double price;
    //constructor
    public Olives(){
        this.image = " ";
        this.name = "Olives";
        this.price = 0.50;
    }

    @Override
    public String getImage() {
        return image;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
