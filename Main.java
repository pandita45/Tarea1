package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println(ProductoYPrecios.COCACOLA.getPrecio());
        ProductoYPrecios.SPRITE.setPrecio(400);
        System.out.println(ProductoYPrecios.COCACOLA.getPrecio());
    }
}
