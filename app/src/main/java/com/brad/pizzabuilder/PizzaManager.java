package com.brad.pizzabuilder;

import android.view.View;

import java.util.ArrayList;

class PizzaManager {
    private static final PizzaManager ourInstance = new PizzaManager();
    private static String manage="Pizzy";
    private ArrayList<Topping> allToppings;
    private PizzaBuilder builder;
    public ArrayList<Topping> selectedToppings;

    public BasePizza createPizzaWithToppings(PizzaType pizzaType, int checkboxIndex, boolean addOrRemove){
        BasePizza genericPizza = PizzaManager.getInstance().makePizza(pizzaType);
        genericPizza.addTopping(allToppings.get(checkboxIndex));
        if (addOrRemove){
            genericPizza.addTopping(allToppings.get(checkboxIndex));
        }else {
            genericPizza.removeTopping(allToppings.get(checkboxIndex));
        }
        return genericPizza;
    }

    static PizzaManager getInstance() {
        return ourInstance;
    }
    public String getName(){
        return manage;
    }

    public BasePizza makePizza(PizzaType pizzaType){
        BasePizza pizza = null;
        switch (pizzaType){
            case Meat:
                pizza = builder.buildMeatLovers();
                break;
            case Veggie:
                pizza = builder.buildVeggie();
                break;
            case Custom:
                pizza = builder.buildCustom(selectedToppings);

        }
        return pizza;
    }

    public void startOrder(){
       // Order.getInstance().
        this.selectedToppings = new ArrayList<Topping>();
        this.allToppings = new ArrayList<Topping>();
        this.allToppings.add(new Anchovies());
        this.allToppings.add(new CanadianBacon());
        this.allToppings.add(new Chicken());
        this.allToppings.add(new ExtraCheese());
        this.allToppings.add(new Garlic());
        this.allToppings.add(new Hamburger());
        this.allToppings.add(new Mushroom());
        this.allToppings.add(new Olives());
        this.allToppings.add(new Onions());
        this.allToppings.add(new Pepperoni());
        this.allToppings.add(new Pineapple());
        this.allToppings.add(new Sausage());
        this.allToppings.add(new Spinach());
        builder = new PizzaBuilder();

    }

    public ArrayList<Topping> getAllToppings(){
        return allToppings;
    }
    private PizzaManager() {
        }

}
