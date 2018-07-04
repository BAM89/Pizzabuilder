package com.brad.pizzabuilder;

public class Pepperoni extends Topping {
    //variable declarations
    public String image;
    public String name;
    public double price;
    //constructor
    public Pepperoni(){
       this.image = " ";
       this.name = "Pepperoni";
       this.price = 1.25;
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
