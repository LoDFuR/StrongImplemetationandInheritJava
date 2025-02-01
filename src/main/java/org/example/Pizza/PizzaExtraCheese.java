package org.example.Pizza;

import org.example.Pizza.Pizza;

public class PizzaExtraCheese  extends Pizza {
    @Override
    public String name(){
        return super.name() + " with extra Cheese ";
    }
}
