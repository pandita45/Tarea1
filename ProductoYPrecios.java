package org.example;

public enum ProductoYPrecios{
    COCACOLA(1,600),
    SPRITE(2, 400),
    FANTA(3, 800),
    SNICKER(4,1000),
    SUPER8(5,300);
    // aqui se define cual es la id de cada producto para poder comprarlo ademas del precio y el nombre del producto

    private final int id;
    private final int precio;

    private ProductoYPrecios(int id, int precio){
        this.id = id;
        this.precio = precio;
    }
    public int getId() {
        return this.id;
    }
    public int getPrecio() {
        return this.precio;
    }
}