package org.example;

public enum ProductoYPrecios{
    COCACOLA(1,600),
    SPRITE(2, 400),
    FANTA(3, 800),
    SUPER8(4,300),
    SNICKER(5,1000);

    private final int id;
    private int precio;

    /**
     * El constructor asigna los valores de precio e id a las variables
     * @param id valor numerico correspondiente a la opcion de compra
     * @param precio  precio del producto en cuestion
     */
    private ProductoYPrecios(int id, int precio){
        this.id = id;
        this.precio = precio;
    }

    /** Funcion que permite cambiar el precio de cierto producto
     * @param precio valor numerico correspondiente al precio
     */
    public void setPrecio(int precio){
        this.precio = precio;
    }

    /**
     * @return Devuelve el id de cierto producto
     */
    public int getId() {
        return this.id;
    }

    /**
     * @return Devuelve el precio de cierto producto en forma de valor numerico
     */
    public int getPrecio() {
        return this.precio;
    }
}
