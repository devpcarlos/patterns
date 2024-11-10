package com.patterns;

public class BurgerCreator extends Creator {

    @Override
    public Product createProduct() {
        return new Burger();
    }
}
