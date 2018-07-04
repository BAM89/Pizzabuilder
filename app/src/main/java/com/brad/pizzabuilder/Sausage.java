package com.brad.pizzabuilder;
import com.brad.pizzabuilder.Topping;

public class Sausage extends Topping {

    public String image;
    public String name;
    public double price;
    //constructor
    public Sausage(){
        this.image = " ";
        this.name = "Sausage";
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
