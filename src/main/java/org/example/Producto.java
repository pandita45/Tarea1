package org.example;

abstract class Producto {
    private int serie;

    /** @param a Determina el numero de serie del producto
     */
    public Producto(int a){
        this.serie = a;
    }

    /**
     * @return Devuelve el numero de serie del producto
     */
    public int getSerie() {
        return serie;
    }

    /**
     * @return Devuelve la accion correspondiente al producto que se compro
     */
    public abstract String accion();
}

