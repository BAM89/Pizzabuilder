package com.brad.pizzabuilder;

public class ExtraCheese extends Topping {

    public String image;
    public String name;
    public double price;
    //constructor
    public ExtraCheese(){
        this.image = " ";
        this.name = "Extra Cheese";
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

