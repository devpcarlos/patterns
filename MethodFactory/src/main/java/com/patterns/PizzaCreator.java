package com.patterns;

public class PizzaCreator extends Creator{

    @Override
    public Product createProduct() {
        return new Pizza();
    }
}
