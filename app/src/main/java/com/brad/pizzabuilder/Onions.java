package com.brad.pizzabuilder;

public class Onions extends Topping {

    public String image;
    public String name;
    public double price;
    //constructor
    public Onions(){
        this.image = " ";
        this.name = "Onions";
        this.price = 0.60;
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

