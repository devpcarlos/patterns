package com.patterns;

public abstract class Creator {
     public abstract Product createProduct();

     public String someOperacion() {
         Product product = createProduct();
         return "hola desde el creador: " + product.Operacion();
     }
}
