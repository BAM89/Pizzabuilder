package com.brad.pizzabuilder;

public class Chicken extends Topping {

    public String image;
    public String name;
    public double price;
    //constructor
    public Chicken(){
        this.image = " ";
        this.name = "Chicken";
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

