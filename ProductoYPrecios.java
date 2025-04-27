package org.example;

public enum ProductoYPrecios{
    COCACOLA(1,600),
    SPRITE(2, 400),
    FANTA(3, 800),
    SUPER8(4,300),
    SNICKER(5,1000);

    // aqui se define cual es la id de cada producto para poder comprarlo ademas del precio y el nombre del producto
    private final int id;
    private int precio;
    /*aqui no se coloca el final para poder modificar el precio desde el main con el
    setPrecio :)*/
    private ProductoYPrecios(int id, int precio){
        this.id = id;
        this.precio = precio;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }
    //precio modificable

    public int getId() {
        return this.id;
    }

    public int getPrecio() {
        return this.precio;
    }
}
