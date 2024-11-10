package com.patterns;

public class KebabCreator extends Creator {
    @Override
    public Product createProduct() {
        return new Kebab();
    }
}
