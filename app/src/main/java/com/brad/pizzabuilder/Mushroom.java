package com.brad.pizzabuilder;

public class Mushroom extends Topping {

    public String image;
    public String name;
    public double price;
    //constructor
    public Mushroom(){
        this.image = " ";
        this.name = "Mushroom";
        this.price = 1.00;
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
