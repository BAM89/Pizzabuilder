package com.brad.pizzabuilder;

public class Pineapple extends Topping {

    public String image;
    public String name;
    public double price;
    //constructor
    public Pineapple(){
        this.image = " ";
        this.name = "Pineapple";
        this.price = 0.95;
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

