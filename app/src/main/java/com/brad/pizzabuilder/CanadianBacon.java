package com.brad.pizzabuilder;

public class CanadianBacon extends Topping {

    public String image;
    public String name;
    public double price;
    //constructor
    public CanadianBacon(){
        this.image = " ";
        this.name = "Canadian Bacon";
        this.price = 1.15;
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
