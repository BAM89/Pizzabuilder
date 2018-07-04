package com.brad.pizzabuilder;

public class Anchovies extends Topping {

    public String image;
    public String name;
    public double price;
    //constructor
    public Anchovies(){
        this.image = " ";
        this.name = "Anchovies";
        this.price = 1.20;
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
