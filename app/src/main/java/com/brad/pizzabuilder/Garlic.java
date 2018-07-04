package com.brad.pizzabuilder;

public class Garlic extends Topping {

    public String image;
    public String name;
    public double price;
    //constructor
    public Garlic(){
        this.image = " ";
        this.name = "Garlic";
        this.price = 0.75;
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

