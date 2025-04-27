package org.example;

abstract class Producto {
    private int serie;

    public Producto(int a){
        this.serie = a;
    }

    public int getSerie() {
        return serie;
    }
    public abstract String accion();
}

