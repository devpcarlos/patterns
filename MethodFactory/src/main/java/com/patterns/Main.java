package com.patterns;

public class Main {
    public static void main(String[] args) {
        PizzaCreator pizzaCreator = new PizzaCreator();
        BurgerCreator burgerCreator = new BurgerCreator();
        System.out.println(pizzaCreator.createProduct().Operacion());
        System.out.println(burgerCreator.createProduct().Operacion());
        KebabCreator kebabCreator = new KebabCreator();
        System.out.println(kebabCreator.createProduct().Operacion());

    }
}